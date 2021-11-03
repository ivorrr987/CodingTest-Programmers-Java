//프로그래머스 level1 2019 카카오 겨울 인턴십
//크레인 인형 뽑기

package programmersLevel1;
import java.util.Stack;

public class PickDolls {

	public static void main(String[] args) {
		
		SolutionPickDolls solution1 = new SolutionPickDolls();
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(solution1.solution(board, moves));
		
		
		
	}

}

class SolutionPickDolls{
	
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> bucket = new Stack<>();
        
        for(int move : moves) {
        	
        	answer += putInBucket(bucket, pick(board, move));
        }
        
        
        return answer;
    }
	
	public int pick(int[][] board, int column) {
		int pickedDoll=0;
		for(int row=0; row<board.length; row++) {
			if(board[row][column-1]!=0) {
				pickedDoll = board[row][column-1];
				fixBoard(board, row, column-1);
				break;
			}
		}
		
		return pickedDoll;
	}
	
	public void fixBoard(int[][] board, int row, int column) {
		board[row][column] = 0;
	}
	
	public int putInBucket(Stack bucket, int pickedDoll) {
		
		int count = 0;
		if(pickedDoll!=0) {
			if(bucket.size()!=0 && bucket.peek().equals(pickedDoll) ) {
				bucket.pop();
				count+=2;
			} else {
				bucket.push(pickedDoll);
			}
		}
		
		return count;
	}
	
	
}


