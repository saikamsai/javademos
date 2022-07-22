import java.util.*;
public class EmailValidation {
	public static void main(String[] args) {
		
	ArrayList<String> EmailId = new ArrayList<String>();
	EmailId.add("Alex2@gmail.com");
	EmailId.add("Sam2@gmail.com");
	EmailId.add("King.2@gmail.com");
	EmailId.add("India.2.03@gmail.com");
	EmailId.add("Hari@gmail.com");
	EmailId.add("Sai23@gmail.com");
	
	System.out.println("Enter Email id to search: ");
	//Asking user to enter Email
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	//Searching input in array of Email id's
	String search= sc.nextLine();
	if(EmailId.contains(search)) {
		System.out.println(search+" is Found");
	}
	else {
		System.out.println(search+ " is Not Found");
	}
	
	}
}