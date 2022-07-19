import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		//declaring variables
		double value1, value2,output;
		char option;

		// creating Scanner class object to read inputs
		Scanner sc = new Scanner(System.in);
     do {
		
		//Arithmetic operator to perform
		System.out.println("Arithmetic operators: \n1. Addition(+)\n2. Subtraction(-)\n3. Multiplication(*)\n4. Division(/)\n5. Exit");
		System.out.println(" ");
		System.out.println("Enter the option to perform Arithmetic operation: ");
		
		//reading the input choice
		option= sc.next().charAt(0);
	
		//using switch-case
		
			switch(option) {		
		//Addition
		case '1':
			System.out.println("Enter two numbers: ");
			value1 = sc.nextDouble();
			value2 = sc.nextDouble();
			output= value1+value2;
			System.out.println(value1 + " + " + value2 + " = " + output);
			break;
			
		// Subtraction 
		case '2':
			System.out.println("Enter two numbers: ");
			value1 = sc.nextDouble();
			value2 = sc.nextDouble();
			output= value1-value2;
			System.out.println(value1 + " - " + value2 + " = " + output);
			break;
			
		// Multiplication
		case '3':
			System.out.println("Enter two numbers: ");
			value1 = sc.nextDouble();
			value2 = sc.nextDouble();
			output= value1*value2;
			System.out.println(value1 + " * " + value2 + " = " + output);
			break;
		
		//Division	
		case '4':
			System.out.println("Enter two numbers: ");
			value1 = sc.nextDouble();
			value2 = sc.nextDouble();
			output= value1/value2;
			System.out.println(value1 + " / " + value2 + " = " + output);
			break;
		//to exit from loop	
		case '5':
			System.exit(0);
			break;
		
		default:
			System.out.println("please enter valid operator");
			break;
			}
	   }
     
     while(option!=5);
	}
}
