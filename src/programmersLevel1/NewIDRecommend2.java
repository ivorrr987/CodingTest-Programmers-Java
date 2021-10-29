package programmersLevel1;

public class NewIDRecommend2 {
	
	public String solution(String new_id) {
		
		int ascii;
		String comparedStr;
		
		if(new_id.length()!=0) {
			
			//step1
			new_id = new_id.toLowerCase(); 
			System.out.println("step1 : " + new_id);
			
			//step2
			for(int i=0; i<new_id.length(); i++) {
				ascii = (int)new_id.charAt(i);
				
				if(!( (45<=ascii && ascii<=57 && ascii != 47) || ascii == 95 || (97<=ascii && ascii<=122) )){
					
					new_id = new_id.replace(new_id.charAt(i), ' ');
				}
			}
			new_id = new_id.replace(" ", "");
			System.out.println("step2 : "+new_id);
			
			//step3
			comparedStr = new_id;
			new_id = new_id.replace("..", ".");
			
			while(new_id != comparedStr) {
				comparedStr = new_id;
				new_id = new_id.replace("..", ".");
			}
			new_id = new_id.replace("\0", "");
			System.out.println("step3 : "+new_id);
			
			//step4
			System.out.println(new_id.equals("."));
			if(new_id.equals(".")) {
				new_id = new_id.substring(0,0);
			} else {
				if(new_id.charAt(0)=='.') {
					new_id = new_id.substring(1);
				}
				if(new_id.charAt(new_id.length()-1)=='.') {
					new_id = new_id.substring(0,new_id.length()-1);
				}
			}
		}
		new_id = new_id.replace("\0", "");
		System.out.println("step4 : "+new_id);
		
		//step5
		if(new_id=="") {
			new_id = "a";
			
		}
		new_id = new_id.replace("\0", "");
		System.out.println("step5 : " +new_id);
		
		//step6
		if(new_id.length()>=16) {
			new_id = (new_id.charAt(14)=='.') ? new_id.substring(0,14) : new_id.substring(0,15);
		}
		new_id = new_id.replace("\0", "");
		System.out.println("step6 : "+new_id);
		
		//step7
		while(new_id.length()<=2) {
			new_id += new_id.substring(new_id.length()-1);
		}
		
		return new_id;
	}

	public static void main(String[] args) {

		NewIDRecommend2 solution = new NewIDRecommend2();
		
		System.out.println(solution.solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(solution.solution("z-+.^."));
		System.out.println(solution.solution("=.="));
		System.out.println(solution.solution("123_.def"));
		System.out.println(solution.solution("abcdefghijklmn.p"));
	}

}
