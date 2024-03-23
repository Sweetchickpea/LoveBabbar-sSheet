package arrayarray;

public class SortZero1and2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a= {0,0,1,2,2,0,2,1,0,2};
       int n= a.length;
       int high= n-1;
       int low=0;int mid=0;int temp;
       
       while(mid<=high) {
    	   switch(a[mid]) {
    	   case 0:
    		   temp= a[low];
    		   a[low]= a[mid];
    		   a[mid]=temp;
    		   mid++;
    		   low++;
    		   break;
    		   
    	   case 1:
    		   mid++;
    		   break;
    	   case 2:
    	   temp= a[high];
    	   a[high]= a[mid];
    	   a[mid]= temp;
    	   high--;
    	   break;
    	   }
       }
	}

}
