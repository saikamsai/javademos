package sample;

public class S3primitivevariables {

	public static void main(String[] args) {
		byte minBytevalue= Byte.MIN_VALUE;
		byte maxBytevalue= Byte.MAX_VALUE;
		System.out.println("min byte value " + minBytevalue);
		System.out.println("max byte value " + maxBytevalue);
		
		byte x= 127;
		System.out.println(x);
			
		short minShortvalue=Short.MIN_VALUE;
		short maxShortvalue=Short.MAX_VALUE;			
		System.out.println("min short : " + minShortvalue);
		System.out.println("max short: " + Short.MAX_VALUE);
			
		short y= 32767;
		System.out.println(y);
			
		System.out.println("min int: "+ Integer.MIN_VALUE);
		System.out.println("max int: "+ Integer.MAX_VALUE);
			
		System.out.println("min long: "+ Long.MIN_VALUE);			
		System.out.println("max long: "+ Long.MAX_VALUE);

	}

}
