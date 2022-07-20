
public class PracticeProject7 {
 private String message="Welcome to Java Programming"; 
	 
	 class Inn{  
	  void disp(){System.out.println(message+", Let's start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		PracticeProject7 obj=new PracticeProject7();
		PracticeProject7.Inn in=obj.new Inn();  
		in.disp();  
	}
}
