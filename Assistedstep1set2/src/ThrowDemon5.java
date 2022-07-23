
public class ThrowDemon5 {
	public static void main(String[] args) {
		int x=40,y=0,res;
		try {
			if(y==0)
				throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                res = x / y;
                System.out.print("\n\tThe result is : " + res);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.print("\n\tError : " + e.getMessage());
        }

        System.out.print("\n\tEnd of program.");
    }
}

		
