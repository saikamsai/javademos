package sample;

public class S9Waysofstring {

	public static void main(String[] args) {
		
		//String literal
		String name="Saikam";
		
		String s2=new String("smtg");
		
		//char array
		char[] c= {'h','e','l','l','o'};
		String s3=new String(c);
		
		byte[] b= {65,66,67};
		String s4=new String(b);
		
		System.out.println("name: "+name);
		System.out.println("length of name: "+ name.length());
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}
