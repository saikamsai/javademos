
public class InsertionSort {
	public static void main(String[] args) {
		int arr[]= {1,12,8,4,9,18};
		Insertsort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static void Insertsort(int[] arr) {
		int length=arr.length;
		for(int j=1;j<length;j++) {
			int search=arr[j];
			int i=j-1;
			while((i>-1) && (arr[i]>search)) {
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=search;
			
		}
		
	}

}
