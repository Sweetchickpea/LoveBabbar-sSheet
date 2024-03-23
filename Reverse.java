package arrayarray;

public class Reverse {

static void revArr(int[] a, int n) {
	int low=0;
	int high= n-1;
	
	while(low<high) {
		int temp= a[low];
		a[low]= a[high];
		a[high]= temp;
		low++;
		high--;
	}
		
}

public static void main(String[] args) {
	int[] a= {1,8,9,4};
	int n= a.length;
	
	revArr(a,n);
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
}


}
