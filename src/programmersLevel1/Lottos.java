package programmersLevel1;

import java.util.*;

public class Lottos {

    public static void main(String[] args){

        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};

        Solution ex1 = new Solution();

        System.out.println(ex1.solution(lottos1, win_nums1)[0]);
        System.out.println(ex1.solution(lottos1, win_nums1)[1]);
    }
}

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int maxCount = 0;
        int minCount = 0;

        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
                maxCount += 1;
            } else {
                if(contains(win_nums, lottos[i])) {
                	maxCount += 1;
                	minCount += 1;
                }
            }
        }

        int maxRank = maxCount<1 ? 6 : 7-maxCount;
        int minRank = minCount<1 ? 6 : 7-minCount;

        int[] answer = {maxRank, minRank};
        
        return answer;
    }

	public static boolean contains(int[] array, int targetValue) {
		
		boolean doesContain = false;
		
		for(int i : array) {
			if(targetValue == i) {
				doesContain = true;
			}
		}
		
		return doesContain;
	}
}


