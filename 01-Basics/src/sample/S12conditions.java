package sample;

public class S12conditions {

	public static void main(String[] args) {

		boolean isAlien = false;
		if (isAlien) {
			System.out.println("it is an alien");

		}
		if (!isAlien) {
			System.out.println("it is not an alien");
		}

		String name = "max";
		if (name == "max") {
			System.out.println("correct name");
		}

		boolean x = true;
		boolean y = true;

		if (x && y) {
			System.out.println("both the conditions are true");
		} else if (x) {
			System.out.println("only x is true");
		} else {
			System.out.println("only y is true");
		}
		System.out.println(" ");

		int a = 3;
		int b = 7;
		int c = 20;

		System.out.println("a < b= " + (a < b));
		System.out.println("a < b and a < c= " + (a < b && a < c)); // logical AND
		System.out.println("a < b and a < c = " + (a < b & a < c)); // bitwise AND

		System.out.println("a < b and a < c= " + (a < b && ++a < c)); // logical AND
		System.out.println("A after logical and = " + a);
		System.out.println("a<b and a<c=" + (a < b & ++a < c));// bitwise and
		System.out.println("a after bitwise and =" + a);
		System.out.println(" ");
		// == comparison
		// = assignment

		boolean mybool = false;
		if (mybool = false) {
			System.out.println("X");

		} else {
			System.out.println("Y");
		}

		System.out.println("what will be the value? " + (mybool = false));
		
		System.out.println("value of a before OR condition =" + a);
		
		//true && false =false
		//true && true=true
			//true || false=true
		System.out.println("a<b or a<c=" + (a < b || ++a < c));// logical or
		System.out.println(a);
		System.out.println("a<b or a<c=" + (a < b | ++a < c));// bitwise or
		System.out.println(a);

	}

}
