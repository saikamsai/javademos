
//parameterized constructor
class Std{
		int id;
		String name;
		String Branch;
		Std(int i,String n, String b)
		{
		id=i;
		name=n;
		Branch=b;
		}

		void display() {
		System.out.println("Stud Id: " +id+" "+" Name: " +name+" " +" Branch: "+ Branch);
		}
	}

public class PracticeProject4Para {
	public static void main(String[] args) {

		Std std1=new Std(2,"John","EEE");
		Std std2=new Std(10,"Allen","ECE");
		Std std3=new Std(15,"Sai","CSE");
		Std std4=new Std(14,"Sam","Civil");
		std1.display();
		std2.display();
		std3.display();
		std4.display();
			}

}
