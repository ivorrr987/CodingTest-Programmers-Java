package codingTest;

public class programmersWeekly1 {

	public static void main(String[] args) {
		SolutionWeekly1 solution1 = new SolutionWeekly1();
		System.out.println(solution1.solution(3, 20, 4));

	}
}

	
class SolutionWeekly1{
	
	public long solution(int price, int money, int count) {
        long answer;
        long totalPrice = (long) (price*(0.5)*count*(1+count));
        
        if(totalPrice > money){
            answer = totalPrice - money; 
        }
        else{
            answer = 0;
        }
        

        return answer;
    }
}
