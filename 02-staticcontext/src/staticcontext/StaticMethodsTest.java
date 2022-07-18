package staticcontext;

public class StaticMethodsTest {

		
		static void method1() {
			System.out.println("inside static method-method1()");
			}
		
		static {
			System.out.println("Inside static block");
			StaticMethodsTest.method1();
		}
		
		public static void main(String[] args) {
			System.out.println("inside main method");
			StaticMethodsTest.method1();
		}
		
	

}
