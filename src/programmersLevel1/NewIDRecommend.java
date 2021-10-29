package programmersLevel1;

public class NewIDRecommend {
	
	public static void test(String newID, int stepCount) {
		
		System.out.println("------------------------------");
		System.out.println("step" + stepCount);
		System.out.println(newID);
		for(int i=0; i<newID.length(); i++) {
			System.out.println("index " + i + " : " + newID.charAt(i));
		}
		System.out.println("------------------------------");
	}
	
	public static String step1(String newID) {

        if(newID.length()!=0) {
            newID = newID.toLowerCase();
        }

        return newID;
    }

    public static String step2(String newID) {

        if(newID.length()!=0) {
            int ascii;

            for(int i=0; i<newID.length(); i++) {
                ascii = (int)newID.charAt(i);
                if(!( (45<=ascii && ascii<=57 && ascii != 47) || ascii == 95 || (97<=ascii && ascii<=122) )){

                    newID = newID.replace(newID.charAt(i), '\0');
                }
            }
            newID = newID.replace("\0","");
        }

        return newID;
    }

    public static String step3(String newID) {

        if(newID.length()!=0) {
            String comparedStr = newID;
            newID = newID.replace("..", ".");

            while(newID != comparedStr) {
                comparedStr = newID;
                newID = newID.replace("..", ".");
            }
        }

        return newID;
    }

    public static String step4(String newID) {

        if(newID.length()!=0) {
            if(newID.equals(".")) {

                newID="";
            }else {
                if(newID.charAt(0)=='.') {

                newID = newID.substring(1);
                }
                if(newID.charAt(newID.length()-1)=='.') {

                newID = newID.substring(0,newID.length()-1);
                }
            }
        }

        return newID;
    }

    public static String step5(String newID) {

        if(newID.length()==0) {
            newID = "a";
        }

        return newID;
    }

    public static String step6(String newID) {

            if(newID.length()>=16){
                newID = (newID.charAt(14)=='.') ? newID.substring(0,14) : newID.substring(0,15);
            }


        return newID;
    }

    public static String step7(String newID) {

            while (newID.length() <= 2) {
                newID += newID.substring(newID.length()-1);
            }

        return newID;
    }
	
	public String solution(String new_id) {
		
		new_id = step1(new_id);
        new_id = step2(new_id);
        new_id = step3(new_id);
        new_id = step4(new_id);
        new_id = step5(new_id);
        new_id = step6(new_id);
        new_id = step7(new_id);
        
        return new_id;
	}

	public static void main(String[] args) {
		
		NewIDRecommend solution = new NewIDRecommend();
		
		System.out.println(solution.solution("...!@BaT#*..y.abcdefghijklm")); //answer is "bat.y.abcdefghi"
		System.out.println(solution.solution("z-+.^.")); //answer is "z--"
		System.out.println(solution.solution("=.=")); //answer is "aaa"
		System.out.println(solution.solution("123_.def")); //answer is "123_.def"
		System.out.println(solution.solution("abcdefghijklmn.p")); //answer is "abcdefghijklmn"
		
	}

}
