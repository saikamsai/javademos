
	//call by value
	public class PracticeProject3callMethod {

	int x=150;

	int calculated(int x) {
		x =x*10/100;
		return(x);
	}

	public static void main(String args[]) {
		PracticeProject3callMethod d = new PracticeProject3callMethod();
		System.out.println("Before calculated value of data = "+d.x);
		d.calculated(150);
		System.out.println("After calculated value of data = "+d.x);
		}
	}

