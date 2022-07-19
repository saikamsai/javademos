package superclass;

public class Child extends Parent{
	int c,d;
	Child(){
		
	}
	Child(int x, int y){
		super(-1,-1);
		this.c=x;
		this.d=y;
	}
	Child(int a, int b,int c, int d){
		super(a, b);
		this.c=c;
		this.d=d;
	}
	void displayDetails() {
		System.out.println("parent a="+a);
		System.out.println("parent b="+b);
		System.out.println("parent c="+c);
		System.out.println("parent d="+d);
	}

}
