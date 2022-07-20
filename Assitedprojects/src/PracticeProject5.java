import java.util.*;

public class PracticeProject5 {
	
		public static void main(String[] args) {
			//creating Arraylist
			System.out.println("ArrayList");
			ArrayList<String> place=new ArrayList<String>();   
			place.add("Chennai");//
			place.add("Hyderabad");    	   
		      System.out.println(place);  
			
			//creating vector
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> vect = new Vector();
		      vect.addElement(18); 
		      vect.addElement(38); 
		      System.out.println(vect);
			
			//creating Linkedlist
		      System.out.println("\n");
		      System.out.println("LinkedList");
		      LinkedList<String> Names=new LinkedList<String>();  
		      Names.add("Sam");  
		      Names.add("John");  	      
		      Iterator<String> itr=Names.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		       
		       //creating hashset
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> set1=new HashSet<Integer>();  
		       set1.add(10);  
		       set1.add(11);  
		       set1.add(12);
		       set1.add(13);
		       System.out.println(set1);
		       
		       //creating linkedhashset
		       System.out.println("\n");
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		       set2.add(1);  
		       set2.add(3);  
		       set2.add(5);
		       set2.add(7);	       
		       System.out.println(set2);
		      	} 
		      }  
}
