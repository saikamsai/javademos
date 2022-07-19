package practiceproject;
public class PracticeProject1 {

	public static void main(String[] args) {
		
		
		// implicit type casting smaller size to bigger size
		System.out.println("Implicit typeCasting");
		char a='H';
		int b=a;
		
		System.out.println("value of a: " +a);
		System.out.println("value of b: " +b);
		
		long c=a;
		System.out.println("value of c: " +c);
		
		double d=a;
		float e=a;
		System.out.println("value of d: " + d);
		System.out.println("value of e: " + e);
		System.out.println(" ");

		// explicit type casting bigger size to smaller size
		System.out.println("Explicit typeCasting");
		
		//long p = 90;
		double q = 80.5;
		int r=(int) q;
		char s =(char) q;
		float t=(float) q;

		
		//System.out.println("value of p: " + p);
		System.out.println("value of q: " + q);
		System.out.println("value of r: " + r);
		System.out.println("value of s: " + s);
		System.out.println("value of t: " + t);
		
	}

}
