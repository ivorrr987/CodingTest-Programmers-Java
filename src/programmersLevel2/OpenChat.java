package programmersLevel2;

import java.util.ArrayList;
import java.util.HashMap;

public class OpenChat {

	public static void main(String[] args) {

		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		SolutionOfOpenChat solution = new SolutionOfOpenChat();
		
		for(String str : solution.solution(record)) {
			System.out.println(str);
		}
		
	}
}

class SolutionOfOpenChat{
	
	public String[] solution(String[] record) {
		
		return getResultString(getLogs(record), mapUserInfo(record));
	}
	
	public HashMap<String, String> mapUserInfo(String[] record) {
		
		HashMap<String, String> userMap = new HashMap<>();
		
		for(String str : record) {
			
			String[] splittedStrings = str.split("\\s");
			
			if(splittedStrings[0].equals("Enter")) {
				userMap.put(splittedStrings[1], splittedStrings[2]);
			} else if(splittedStrings[0].equals("Change")) {
				userMap.put(splittedStrings[1], splittedStrings[2]);
			}
		}
		
		
		return userMap;
	}
	
	public ArrayList<String[]> getLogs(String[] record){
		
		ArrayList<String[]> logs = new ArrayList<>();

		for(String str : record) {
			String[] splittedStrings = str.split("\\s");
			
			logs.add(new String[] {splittedStrings[1], splittedStrings[0]});
		}
		
		
		return logs;
	}
	
	public String[] getResultString(ArrayList<String[]> logs, HashMap<String, String> userMap) {
		
		ArrayList<String> temp= new ArrayList<>();
		
		for(String[] log : logs) {
			if(log[1].equals("Enter")) {
				temp.add(userMap.get(log[0])+"님이 들어왔습니다.");
			} else if(log[1].equals("Leave")) {
				temp.add(userMap.get(log[0])+"님이 나갔습니다.");
			}
		}
		
		String[] result = new String[temp.size()];
		
		for(int i=0; i<temp.size(); i++) {
			result[i] = temp.get(i);
		}
		
		return result;
		
	}
	
	
	
}	