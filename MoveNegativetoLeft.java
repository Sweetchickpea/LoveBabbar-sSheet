package arrayarray;

public class MoveNegativetoLeft {
	
	public static void mnvl(int[] a,int n) {
		int count=0;
		
		for(int i=0; i<n;i++) {
			if(a[i]<0) {
				int temp= a[count];
				a[count]= a[i];
				a[i]= temp;
				count++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-7,0,3,-6,8,0,-7};
		int n= a.length;
		
		mnvl(a,n);
		
		for(int x:a)
		System.out.print(x+" ");

	}

}
