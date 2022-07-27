
import java.util.Arrays;
import java.util.Collections;
@SuppressWarnings("unused")
public class Ordered2{
	public static  int Nthsmallest(int arr[],int i) {
		Arrays.sort(arr);
		return arr[i-1];
		
	}
	public static void main(String[] args) {
	int	arr []= new int[] {12, 3, 5, 17, 4, 19, 26};
	int i=4;
	System.out.println("fourth smallest element is: " + Nthsmallest(arr,i));
		
	}
	
}
