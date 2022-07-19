package nonstaticcontext;

public class NonStaticVarDemo {
	static int y=10;
	//non-static variable
	//instance variable
int num;
static{
	System.out.println("inside static block");
}
{
	System.out.println("inside non static block");
}
NonStaticVarDemo(int x) {
	System.out.println("inside the constructor");
this.num=x;
}
	public static void main(String[] args) {
System.out.println("inside main method");
NonStaticVarDemo nsvd= new NonStaticVarDemo(20);
System.out.println(nsvd.num);


	}

}
