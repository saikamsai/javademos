
//method overloading

public class PracticeProject3overloadMethod {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int c) 
    {
         System.out.println("Area of Circle : "+(3.14*c*c));
    }

    public static void main(String args[])
   {

PracticeProject3overloadMethod o=new PracticeProject3overloadMethod();
       o.area(1,5);
       o.area(8);  
   }
}


