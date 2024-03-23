package arrayarray;

import java.util.Arrays;

public class MaxMin {
   public static int findMax(int[] a) {
	   Arrays.sort(a);
	   return a[a.length-1];
   }
   public static int findMin(int[] a) {
	   Arrays.sort(a);
	   return a[0];
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,8,4,8};
		int max= findMax(a);
		int min= findMin(a);
		
		System.out.println("max is:"+" "+max);
		System.out.println("min is:"+" "+min);

	}

}
