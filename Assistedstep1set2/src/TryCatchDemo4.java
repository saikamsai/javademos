
public class TryCatchDemo4 {
	public static void main(String[] args) {
		int [] array=new int [8];
		try {
			array[17]=8;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds...");
		}
		finally {
			System.out.println("array size :"+ array.length);
		}
	}

}
