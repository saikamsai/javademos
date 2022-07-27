
public class SelectionSort {
	public static void main(String[] args) {
		int [] arr= {1,8,7,2,5,6,3,9,4,0};
		@SuppressWarnings("unused")
		int arrlength=arr.length;
		sort(arr);
		System.out.println("The sorted elements in Array ");
		for(int i:arr) {
			System.out.println(i);
		}
		
	}

	public static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			//swapping if min value is not i
			int smallValue=arr[min];
			arr[min]=arr[i];
			arr[i]=smallValue;
		}
		
	}
	
}
