package lists;
import java.util.ArrayList;
import java.util.List;
public class Listdemo4 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<100;i+=7) {
			list.add(i);
		}
		System.out.println("First list:"+list);
		
		System.out.println("Element at position5: "+list.get(5));
		
		list.remove(5);
		System.out.println("List after romving element at 5:"+list);
		
		list.remove(new Integer(77));
		System.out.println("list after removing element 77:"+list);
		
	
		
	}

}
