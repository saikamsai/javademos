
public class FinallyBlockDemo5 {
    public static void main(String[] args)
    {
        int x=45,y=0,res=0;
        try
        {
            res = x / y;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + res);
        }
    }


}
