
public class BinarySearch {
	public static void main(String[] args) {
		int [] arr= {13,16,19,22,25};
		int search=22;
		int arrlength=arr.length;
		BinarySearch(arr,0,search,arrlength);
	}

	public static void BinarySearch(int[] arr, int i, int search, int length) {
		int mid=(i+length)/2;
		while(i<=length) {
			if(arr[mid]<search) {
				i=mid+1;
	}
			else if(arr[mid]==search) {
				System.out.println("Element is present and found at index "+mid);
				break;
			}else {
				length=mid-1;
			}
			mid=(i+length)/2;
			
		}
		if(i>length) {
			System.out.println("Element is not present in Array");
		}
		
	}

}
