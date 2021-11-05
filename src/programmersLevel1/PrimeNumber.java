package programmersLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int[] nums = {1,2,7,6,4};
		int start = getSums(nums).get(0);
		int end = getSums(nums).get(getSums(nums).size()-1);
		int n = end;
		
		System.out.println(start);
		System.out.println(end);
		
		System.out.println("--------------------");
		
		for(Integer i : getSums(nums)) {
			System.out.println(i);
		}
		
		System.out.println("--------------------");
		
		for(int i=start; i<getPrimeNumbers(n).size(); i++) {
			System.out.println(getPrimeNumbers(n).get(i));
		
		}
		
		System.out.println(getPrimeNumbers(n).toString());
		System.out.println(getPrimeNumbersCount(getSums(nums)));
	}

	public static ArrayList<Integer> getPrimeNumbers(int n) {
		
		Map<Integer, Boolean> numbers = new HashMap<>();
		
		for(int i=2; i<=n; i++) {
			numbers.put(i, true);
		}
		
		for(int i=2; i<=(int)Math.sqrt(n); i++) {
			for(int j=2; i*j <= n; j++) {
				if(numbers.containsKey(i*j)) {
					numbers.put(i*j, false);
				}
			}
		}
		
		ArrayList<Integer> primeNumbers = new ArrayList<>();
		
		for(Integer number : numbers.keySet()) {
			if(numbers.get(number)) {
				primeNumbers.add(number);
			}
		}
		
		return primeNumbers;
	}
	
	public static ArrayList<Integer> getSums(int[] nums) {
		
		ArrayList<Integer> sums = new ArrayList<>();
		
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length-2; i++){
			for(int j=i+1; j<nums.length-1; j++) {
				for(int k=j+1; k<nums.length; k++) {
					sums.add(nums[i]+nums[j]+nums[k]);
				}
			}
		}
		
		return sums;
	}
	
	public static int getPrimeNumbersCount(ArrayList<Integer> sums) {
		
		int count=0;
		
		for(Integer sum : sums) {
			if(getPrimeNumbers(sums.get(sums.size()-1)).contains(sum)) {
				count++;
				System.out.println(sum);
			}
		}
		
		return count;
	}
}
