package sample;

public class S14Typecastingchallenge {

	public static void main(String[] args) {
		
		String input="68";
		
		//covert the string input above into appropriate primitive type
		
		byte mybyte =Byte.parseByte(input);
		System.out.println("Byte val= "+mybyte);
		
		int myint=Integer.parseInt(input);
		System.out.println("Integer val ="+myint);
		
		Double d=Double.parseDouble(input);
		System.out.println("double: "+d);
		
		int i=Integer.valueOf(input);
		System.out.println(i);
		
		char input2=(char)Integer.parseInt(input);
		System.out.println(input2);
		
	
		

		

	}

}
