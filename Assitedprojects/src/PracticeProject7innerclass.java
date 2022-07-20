
public class PracticeProject7innerclass {

		private String message="Inner Classes";

		 void disp(){  
			 class Inn{  
				 void message(){
					 System.out.println(message);
				 }  
		  }  
		  
		  Inn l=new Inn();  
		  l.message();  
		 }  

		 
		public static void main(String[] args) {
			PracticeProject7innerclass  ob=new PracticeProject7innerclass ();  
			ob.disp();  
		}
}
