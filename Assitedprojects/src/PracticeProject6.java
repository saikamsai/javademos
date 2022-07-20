import java.util.*;
public class PracticeProject6 {
	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> hmp=new HashMap<Integer,String>();      
	      hmp.put(1,"Alex");    
	      hmp.put(2,"Sai");    
	      hmp.put(3,"Sam");   
	       
	      System.out.println("\nThe elements of Hashmap are: ");  
	      for(Map.Entry m:hmp.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> htb=new Hashtable<Integer,String>();  
	      
	      htb.put(4,"Ab");  
	      htb.put(5,"Cd");  
	      htb.put(6,"Ef");  
	      htb.put(7,"Gh");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:htb.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Apple");    
	      map.put(9,"Carrot");    
	      map.put(10,"Orange");       
	      
	      System.out.println("\nThe elements of TreeMap are: ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  


}
