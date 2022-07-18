package nonstaticcontext;

public class NonStaticVarDemo {
int num;
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
