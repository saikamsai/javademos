import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppendFile {
   public static void main( String[] args ) throws IOException {
	   String textToAppend = "Happy Learning !!";

	   Path path = Paths.get("C:\\demo\\music.txt");

	   Files.write(path, textToAppend.getBytes(), StandardOpenOption.APPEND); 
	  
   }
   
}
