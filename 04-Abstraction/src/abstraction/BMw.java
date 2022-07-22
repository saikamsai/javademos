package abstraction;

import fullabstraction.Car;
public abstract class BMw {
BMw() {
		
	}
	
	int x;

	void commonFunctionality() {
		System.out.println("Inside common functionality method");
	}
	
	abstract void accelarate();
	
	public static void main(String[] args) {
		System.out.println("inside main of abstract class");
	}

}
