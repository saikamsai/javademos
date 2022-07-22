package exceptionsdemo;

public class Multilplicatch {

	public static void main(String[] args) {
try {
	String input=args[0];
	System.out.println("Input: "+input);
	int output=Integer.parseInt(input);
	System.out.println("output: "+output); 
	
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("input is required");
}catch(NumberFormatException e) {
	System.out.println("input must be a number");
}
System.out.println("continue with more logic..");
	}

}
