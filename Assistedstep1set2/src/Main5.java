@SuppressWarnings("serial")
class MException extends Exception 
{ 
    public MException(String s) 
    { 
        super(s); 
    } 
} 
public class Main5 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MException("temp"); 
        } 
        catch (MException e) 
        { 
            System.out.println("Caught"); 
            System.out.println(e.getMessage()); 
        } 
    } 
}
