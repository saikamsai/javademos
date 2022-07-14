package sample;

public class S14termary {

	public static void main(String[] args) {

		int age = 15;
		boolean hasLicense = true;
		boolean canDrive = (age > 18) ? true : false;
		boolean canRentACar = canDrive ? (hasLicense ? true : false) : false;

		System.out.println("Age : " + age);
		System.out.println("Has License = " + hasLicense);
		System.out.println("Can Drive ? " + canDrive);
		System.out.println("Can Rent a Car ? " + canRentACar);

// 
		System.out.println(" ");
		String result = canDrive ? (hasLicense ? "has license can drive" : "no license can't drive") : "cannot drive";
		System.out.println(result);
		
		// WRONG SYNTAX  (canDrive)? System.out.println("canDrive"): System.out.println("cannot drive");
		System.out.println((canDrive)? "canDrive ": "cannot drive");
	}
// SYNTAX = (condition) ? true value: false value
	

}
