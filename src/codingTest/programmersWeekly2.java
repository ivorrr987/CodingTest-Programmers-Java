package codingTest;

import java.util.Arrays;

public class programmersWeekly2 {

	public static void main(String[] args) {
		
		SolutionWeekly2 solution1 = new SolutionWeekly2();
		int[][] score = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
		System.out.println(solution1.solution(score));
		
		
		System.out.println(solution1.grading(47.6));
		System.out.println(solution1.grading(90));
		System.out.println(solution1.grading(67));
		System.out.println(solution1.grading(80));
		
	}
	
}

class SolutionWeekly2 {
    public String solution(int[][] scores) {
        String answer = "";
        int[][] scores2 = new int[scores.length][scores.length];
        int owns;
        double sumOfScores = 0;
        int numOfScores = scores.length;
        
        for(int i=0; i<scores.length; i++){
            for(int j=0; j<scores.length; j++){
                scores2[i][j] = scores[j][i];
                sumOfScores += scores[j][i]; 
            }
            owns = scores2[i][i];
            Arrays.sort(scores2[i]);
            
            if(owns == scores2[i][0] && scores2[i][0] != scores2[i][1]) {
            	sumOfScores -= owns;
            	numOfScores -= 1;
            	answer += grading(sumOfScores/numOfScores);
            }
            else if(owns == scores2[i][scores.length-1] && scores2[i][scores.length-1] != scores2[i][scores.length-2]) {
            	sumOfScores -= owns;
            	numOfScores -= 1;
            	answer += grading(sumOfScores/numOfScores);
            }
            else {
            	answer += grading(sumOfScores/numOfScores);
            }
            sumOfScores = 0;
            numOfScores = scores.length;
        }
        
        return answer;
    }
    
    public String grading(double avg) {
    	String grade;
    	
    	if(avg>=90) {
    		grade = "A";
    	}
    	else if(avg>=80) {
    		grade = "B";
    	}
    	else if(avg>=70) {
    		grade = "C";
    	}
    	else if(avg>=50) {
    		grade = "D";
    	}
    	else {
    		grade = "F";
    	}
    	
    	return grade;
    }
}

