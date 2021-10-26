package practices;
import java.util.*;

public class Practice1 {

	public static void main(String[] args) {
		
		int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};
        
        for(int i : lottos1) {
        	System.out.println(i + " : " + Arrays.asList(win_nums1).contains(i));
        }
        System.out.println(" : " + Arrays.asList(win_nums1).contains(1));
        
        int[] arr = {10,25,23,14,85,65};
        int key = 14;
        boolean val = contains(arr, key);
        System.out.println("Array contains "+key+"? \n"+val);
	}
	
	public static boolean contains(final int[] arr, final int key) {
        return Arrays.asList(arr).contains(key);
    }

}
