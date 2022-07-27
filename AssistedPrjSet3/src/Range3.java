
public class Range3 {
	public static int sum(int arr[], int L,int R) {
		int sum=0;
		for(int i=L;i<=R;i++) {
		sum +=arr[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int arr[]=new int[] {3, 7, 2, 5, 8, 9 };
		
		System.out.println("sum of numbers in the range: " +sum(arr,0,5));
		System.out.println("sum of numbers in the range: " +sum(arr,2,5));
		System.out.println("sum of numbers in the range: " +sum(arr,3,4));
		System.out.println("sum of numbers in the range: " +sum(arr,5,5));
	
	
	}
}
