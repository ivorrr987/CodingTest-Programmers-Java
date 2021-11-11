package programmersLevel1;

import java.util.HashMap;

public class NewsClustering {

	public static void main(String[] args) {
		
		SolutionOfNewClustering solution = new SolutionOfNewClustering();  
		
		System.out.println(solution.solution("FRANCE", "french"));
		System.out.println(solution.solution("handshake", "shake hands"));
		System.out.println(solution.solution("aa1+aa2", "AAAA12"));
		System.out.println(solution.solution("E=M*C^2", "e=m*c^2"));
		
	}

}

class SolutionOfNewClustering{
	
	public int solution(String str1, String str2) {
		
		double answer = 65536;
		int interSectionCount = 0;
		int unionCount = 0;
		
		for(String str : getStringMaps(str1).keySet()) {
			if(getStringMaps(str2).containsKey(str)) {
				interSectionCount+=Math.min(getStringMaps(str1).get(str), getStringMaps(str2).get(str));
				unionCount+=Math.max(getStringMaps(str1).get(str), getStringMaps(str2).get(str));
			} else {
				unionCount+=getStringMaps(str1).get(str);
			}
		}
		
		for(String str : getStringMaps(str2).keySet()) {
			if(!getStringMaps(str1).containsKey(str)) {
				unionCount+=getStringMaps(str2).get(str);
			}
		}
		
		if(interSectionCount==0 && unionCount==0) {
			return (int)answer;
		}
		
		answer = answer * (double)interSectionCount/unionCount;
		
		
        return (int)answer;
    }
	
	public HashMap<String, Integer> getStringMaps(String str) {
		
		HashMap<String, Integer> strMap = new HashMap<>();
		
		str = str.toLowerCase();
		
		
		for (int i=0; i<str.length()-1; i++) {
			if(isValidString(str.substring(i,i+2))){
				if(strMap.get(str.substring(i,i+2))==null) {
					strMap.put(str.substring(i,i+2), 1);
				} else {
					strMap.put(str.substring(i,i+2), strMap.get(str.substring(i, i+2))+1);
				}
			}
		}
		
		return strMap;
	}
	
	public boolean isValidString (String str) {
		
		if(97<=str.charAt(0) && str.charAt(1)<=122 && 97<=str.charAt(1) && str.charAt(1)<=122) {
			return true;
		} else {
			return false;
		}
	}
}

