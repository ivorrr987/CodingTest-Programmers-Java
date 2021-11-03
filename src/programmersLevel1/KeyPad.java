package programmersLevel1;

public class KeyPad {
	
	

	public static void main(String[] args) {
		SolutionKeyPad solution = new SolutionKeyPad();
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand2 = "left";
		int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand3 = "right";
		
		//System.out.println(solution.solution(numbers, hand));
		//System.out.println("----------------------------");
		System.out.println(solution.solution(numbers2, hand2));
		//System.out.println("----------------------------");
		//System.out.println(solution.solution(numbers3, hand3));
		
	}

}

class SolutionKeyPad {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int nowLeftHand = 10;
        int nowRightHand = 12;
        
        for (int i=0; i<numbers.length; i++){
            if(numbers[i]==0){
                numbers[i] = 11;
            }
        }
        
        
        for (int nowNumber : numbers){
        	System.out.println("입력된 숫자: " + nowNumber + ", 현재 왼손 숫자 : " + nowLeftHand + ", 현재 오른손 숫자 : " + nowRightHand);
        	System.out.println("입력된 숫자 좌표: (" + getRowColumn(nowNumber)[0] + ", " + getRowColumn(nowNumber)[1] + ")"
        		  +	", 현재 왼손 숫자 좌표 : (" + getRowColumn(nowLeftHand)[0] + ", " + getRowColumn(nowLeftHand)[1]  + ")"
        				  + ", 현재 오른손 숫자 좌표 : (" + getRowColumn(nowRightHand)[0] + ", " + getRowColumn(nowRightHand)[1] + ")" );
        	System.out.println("현재 왼손 숫자와 입력된 숫자 사이의 거리 : " + getDistance(getRowColumn(nowLeftHand), getRowColumn(nowNumber))
        	+ ", 오른손 숫자와 입력 숫자 사이의 거리 : " + getDistance(getRowColumn(nowRightHand), getRowColumn(nowNumber)) );
            if(nowNumber % 3 == 1){
                answer += "L";
                nowLeftHand = nowNumber;
            } else if(nowNumber % 3 == 0){
                answer += "R";
                nowRightHand = nowNumber;
            } else {
                if(getDistance(getRowColumn(nowNumber), getRowColumn(nowLeftHand)) > getDistance(getRowColumn(nowNumber), getRowColumn(nowRightHand))){
                    answer += "R";
                    nowRightHand = nowNumber;
                } else if(getDistance(getRowColumn(nowNumber), getRowColumn(nowLeftHand)) < getDistance(getRowColumn(nowNumber), getRowColumn(nowRightHand))){
                    answer += "L";
                    nowLeftHand = nowNumber;
                } else {
                    if (hand == "left") {
                    	answer += "L";
                    	nowLeftHand = nowNumber;
                    } else {
                    	answer += "R";
                    	nowRightHand = nowNumber;
                    }
                }
            }
            System.out.println(answer + "\n");
        }
        
        
        
        return answer;  
    }


	int[] getRowColumn(int number){
	    int[] rowColumn = {0,0};
	    rowColumn[0] = (int) Math.ceil((double)number/3);
	    rowColumn[1] = (number%3==0) ? 3 : number%3;
	    
	    
	    return rowColumn;
	}
	
	int getDistance(int[] first, int[] second){
	    
	    return Math.abs(first[0]-second[0]) + Math.abs(first[1]-second[1]);
	}
}

