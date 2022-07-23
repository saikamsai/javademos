import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

@SuppressWarnings("unused")
public class ReadWriteAppend {
	public static void main(String [] args) {
		try {

			File obj= new File ("NewFile.txt");

			if(obj.exists())
			{
			FileWriter writefile=new FileWriter("NewFile.txt");

			writefile.write("Welcome to Java programming language! ");

			System.out.println("File written Successfully!!!");

			BufferedWriter appendtxt=new BufferedWriter (writefile);

			System.out.println("Enter the Data to be Append");
			try (Scanner scanner = new Scanner(System.in)) {
				String data= scanner.nextLine();
				appendtxt.append(data);
			}

			appendtxt.close();
			writefile.close();
			System.out.println("File Appeneded Successfully!!!");

			Scanner readfile=new Scanner(obj);

			while(readfile.hasNext())
			{
			String texts=readfile.nextLine();

			System.out.println("Data in the files:"+ " " +texts);
					 System.out.println("File Read Successfully!!!");
			}
			readfile.close();
			}
			else if(obj.createNewFile())
			{
			System.out.println("File Created: " +" " +obj.getName());

			System.out.println("File Created Successfully!!!");
			}
			else {
			System.out.println("File Not Created...");
			}
			
		}
			catch(Exception e){
			System.out.println(" Error occurred...");
			e.printStackTrace();
			}
  }
	
}
		

