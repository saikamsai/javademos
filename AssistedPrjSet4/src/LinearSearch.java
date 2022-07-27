import java.util.Scanner;

public class LinearSearch {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int [] arr= {10,11,15,20,14,25,30,100,80,95,46};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to search: ");
		int Searchvalue= sc.nextInt();
		
		int result=(int)linear(arr,Searchvalue);
		if(result==-1) {
			System.out.println("Element is not present in Array");
			
		}else {
			System.out.println("Element present in array and found at index "+ result);
		}
	}
	public static int linear(int[] arr, int x) {
		int arrlength=arr.length;
		for(int i=0;i<=arrlength-1;i++) {
			if(arr[i]==x) {
				return i;
			}
			
		}
		return -1;
	}

}
