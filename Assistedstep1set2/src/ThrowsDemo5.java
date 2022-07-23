
public class ThrowsDemo5 {
	void Division() throws ArithmeticException
    {
        int x=20,y=0,res;
res = x / y;
        System.out.print("\n\tThe result is : " + res);
    }
     public static void main(String[] args)
    {
ThrowsDemo5 T = new ThrowsDemo5();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd of program.");
    }


}
