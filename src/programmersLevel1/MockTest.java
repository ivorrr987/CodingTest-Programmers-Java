package programmersLevel1;

import java.util.ArrayList;

public class MockTest {

	public static void main(String[] args) {

		SolutionOfMockTest solution = new SolutionOfMockTest();
		
		int[] answers = {1,3,2,4,2};
		
		for(int i: solution.solution(answers)) {
			System.out.println(i);
		}
		
		
	}
	

}

class SolutionOfMockTest{
	
	public int[] solution(int[] answers) {
		
		int[] counts = {countAnswers(answers, 1), countAnswers(answers, 2), countAnswers(answers,3)};
		
		return getMaxCountStudents(counts);
	}
	
	public int[] getMaxCountStudents(int[] counts) {
		
		int maxCount = Math.max(counts[0], Math.max(counts[1], counts[2]));
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int i=0; i<counts.length; i++) {
			if(maxCount == counts[i]) {
				temp.add((Integer) i+1);
			}
		}
		
		int[] maxCountStudents = new int[temp.size()];
		
		for(int i=0; i<temp.size(); i++) {
			maxCountStudents[i] = (int) temp.get(i);
		}
		
		return maxCountStudents;
	}
	
	public int countAnswers(int[] answers, int who) {
		
		int count = 0;
		
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		
		int[] answering1 = {1,2,3,4,5};
		int[] answering2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] answering3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		for(int i : answers) {
			
			if(who==1) {
				if(answering1[index1]==i) {
					count+=1;
				}
				if(index1==4) {
					index1=0;
				} else {
					index1+=1;
				}
			} else if(who==2) {
				if(answering2[index2]==i) {
					count+=1;
				}
				if(index2==7) {
					index2=0;
				} else {
					index2+=1;
				}
			} else {
				if(answering3[index3]==i) {
					count+=1;
				}
				if(index3==9) {
					index3=0;
				} else {
					index3+=1;
				}
			}
		}
		
		return count;
	}
	
}
