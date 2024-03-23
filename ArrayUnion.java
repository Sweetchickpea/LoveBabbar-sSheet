package arrayarray;

import java.util.HashSet;

public class ArrayUnion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,6};
		int[] b= {2,3,4,5,8};
		
		HashSet<Integer> hs= new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			hs.add(b[i]);
		}
		for(int x:hs) {
			System.out.print(x+" ");
		}

	}

}
