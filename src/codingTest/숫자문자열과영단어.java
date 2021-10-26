//프로그래머스 level1. '숫자 문자열과 영단어' 
//뽑은 숫자들을 문자열로 만든 후 일부 숫자를 one, seven 등으로 바꾸어 전달하고, 전달받은 사람은 원래의 숫자목록을 String이 아닌 int형으로 return.


package codingTest;


public class 숫자문자열과영단어 {

	public static void main(String[] args) {
		String s="2three45sixseven";
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
        
        s = s.replace("zero", "0");
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");
        
        int answer = Integer.parseInt(s);
        
        return answer;
    }
}


