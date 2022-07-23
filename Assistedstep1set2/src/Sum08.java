public class Sum08 
{
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
public static void main(String args[]) 
{ 
    Sum08 s = new Sum08(); 
    System.out.println(s.sum(4, 84)); 
    System.out.println(s.sum(10, 20, 30)); 
    System.out.println(s.sum(80.5, 40.5)); 
} 
}
