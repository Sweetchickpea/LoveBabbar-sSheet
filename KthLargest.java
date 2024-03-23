package arrayarray;

public class KthLargest {
	
	public static int kthLargest(int[] a, int total) {
		//int n= a.length;
		
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if (a[i]>a[j]) {
					int temp= a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
			
		}
		return a[total-4];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,7,9,4,6,7}; int total= a.length;
		int k=4;
	System.out.println(kthLargest(a,total));

	}

}
