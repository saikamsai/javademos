package staticcontext;
class StaticBlockTest {
public static void main(String[] args) {
	System.out.println("inside main method");
}

static {
	System.out.println("static block 2");
	System.out.println("create connection to system 1");
}

static{
	System.out.println("Static block 1");
}
}
