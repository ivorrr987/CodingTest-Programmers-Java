package programmersLevel1;

public class Box {

	public static void main(String[] args) {
		SolutionOfBox solution = new SolutionOfBox();
		
		System.out.println(solution.solution(8, 12));
		System.out.println(solution.solution(12, 8));
		System.out.println(solution.solution(123, 824));
		
		System.out.println(solution.gcd(12,8));
		System.out.println(solution.gcd(1071,1029));
	}

}

class SolutionOfBox{
	
	public long solution(int w, int h) {
		
		return (long)w*h - (w+h) +gcd(w,h);
	}
	
	public int gcd(int x, int y) { 
		
		if(x==y) {
			return x; 
		} else if(x>y) {
			return (x%y==0)? y : gcd(y, x%y);
		} else {
			return (y%x==0)? x : gcd(x, y%x);
		}
	
	}
}
