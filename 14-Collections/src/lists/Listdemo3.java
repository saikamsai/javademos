package lists;

import java.util.ArrayList;
import java.util.List;

public class Listdemo3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i += 12) {
			list.add(i);
		}
		System.out.println(list);
		List<Integer> secondlist = new ArrayList<Integer>();
		secondlist.add(111);
		secondlist.add(222);
		secondlist.add(333);
		System.out.println("second list : " + secondlist);

		// list.addAll(4,secondlist);
		// System.out.println("After add 2nd list to 1st list: "+list);
		secondlist.addAll(list);
		System.out.println(secondlist);
	}

}
