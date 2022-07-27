import java.util.*;
public class Queue9 {
	public static void main(String[] args) 
	{
		Queue<String> locationsQueue = new LinkedList<>();
	locationsQueue.add("Hyderabad");
	        		locationsQueue.add("Chennai");
	        		locationsQueue.add("Delhi");
	        		locationsQueue.add("Bangalore");
	        		locationsQueue.add("Kerala");
	System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}


}
