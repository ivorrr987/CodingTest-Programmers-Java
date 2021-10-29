package practices;
import java.util.*;

public class Practice1 {

	public static void main(String[] args) {
		
		String s1 = "abc67.!@#$%^&*()";
		
		for(int i=0; i<s1.length(); i++) {
			System.out.println(s1.charAt(i) + " : " + (int)s1.charAt(i));
		}
	}
	
	public static boolean contains(final int[] arr, final int key) {
        return Arrays.asList(arr).contains(key);
    }

}
