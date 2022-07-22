package exceptionsdemo;

import java.util.Scanner;
public class DivideByZero {

	public static void main(String[] args) {
		
		int a,b,c,d;
		System.out.println("enter two integers:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		try {
			c=a/b;
			d=a%b;
			System.out.println(a+"/"+b+"="+c+",Remainder="+d);
		}catch(ArithmeticException e) {
			System.out.println("division by zero error occured");
		}
		System.out.println("other programming logic continues below..");
	}

}
