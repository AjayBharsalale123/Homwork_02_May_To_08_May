package HW_Geekster_May;

import java.util.Arrays;

public class hw_04_May {

	public static void main(String[] args) {
		int[]a = {1,6,2,7,-9,-4,4,3,-5};
		
		findsquare(a);
		
		System.out.println(sumOfUnique(a));

	}
	
	
	public static void findsquare(int []a) {
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]*a[i];
		}
		System.out.println(Arrays.toString(a));
	}
	
	
	 public static int sumOfUnique(int[] nums) {
	        
	       int[] counter = new int[101];
	        for (int num : nums) {
	            ++counter[num];
	        }
	        int ans = 0;
	        for (int i = 0; i < 101; ++i) {
	            if (counter[i] == 1) {
	                ans = ans + i;
	            }
	        }
	        return ans;
	    }

}
