//default constructor

class studentInfo {
	int id;
	String name;
	int RegNo;

	void display() {
		System.out.println(id + " " + name + " " + RegNo);
	}
}

public class PracticeProject4 {
	public static void main(String[] args) {

		studentInfo st1 = new studentInfo();
		studentInfo st2 = new studentInfo();

		st1.display();
		st2.display();
	}

}
