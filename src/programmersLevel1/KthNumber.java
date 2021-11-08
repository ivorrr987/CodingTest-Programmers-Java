package programmersLevel1;

import java.util.Arrays;

public class KthNumber {

	public static void main(String[] args) {
		
		SolutionOfKthNumber solution = new SolutionOfKthNumber();
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		for(int i: solution.solution(array, commands)) {
			System.out.println(i);
		}
		
		
	}
	
	

}

class SolutionOfKthNumber{
	public int[] solution(int[] array, int[][] commands) {
		
		int commandsLength = commands.length;
		int[] answer = new int[commandsLength];
		
		for(int i=0; i<commandsLength; i++) {
			int[] subArray = getSubArray(array, commands[i][0], commands[i][1]);
			answer[i] = getKthNumber(subArray, commands[i][2]);
		}
		
		return answer;
	}
	
	public int[] getSubArray(int[] array, int start, int end) {
		
		int size = end-start+1;
		
		int[] subArray = new int[size];
		
		for(int i=0; i < size; i++) {
			subArray[i] = array[start+i-1];
		}
		
		Arrays.sort(subArray);
		
		return subArray;
	}
	
	public int getKthNumber(int[] array, int k) {
		
		return array[k-1];
	}
	
}
