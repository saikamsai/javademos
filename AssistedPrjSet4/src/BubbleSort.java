
public class BubbleSort {
	public static void main(String[] args) {
		int [] arr= {1,8,4,9,5,82,75};
	buublesort(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
      }

	public static void buublesort(int[] arr) {
		int arrlength=arr.length;
		int temp=0;
		for(int i=0;i<arrlength;i++) {
			for(int j=1;j<arrlength;j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}
	

}
