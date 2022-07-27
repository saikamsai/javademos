import java.util.Arrays;

public class ExponentialSearch {
	public static void main(String[] args) {
	int [] arr= {1,25,31,45,65};
	int arrlength=arr.length;
	int search=45;
	int result=expsearch(arr,arrlength,search);
	if(result<0) {
		System.out.println("Element is not present in the Array");
	
	}else {
		System.out.println("Element is present in Array and foundt at index "+result);
	}
}
	public static int expsearch(int[] arr, int arrlength, int search) {
		if(arr[0]==search) {
			return 0;
		}
		int i=1;
		while(i<arrlength && arr[i]<=search) {
			i=i*2;
	}
		return Arrays.binarySearch(arr, i/2, 
                Math.min(i, arrlength), search);
		
	}
	

}
