package lists;
import java.util.ArrayList;
public class ListDemo {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("hello");
		list.add(30.45);
		System.out.println(list);
		
		ArrayList<Integer>myintegers=new ArrayList<>();
		myintegers.add(10);
		myintegers.add(new Integer(20));
		myintegers.add(30);
		System.out.println(myintegers);
	}
	 

}
