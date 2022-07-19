package chaining;

public class Parent {
	int x;
	Parent(){
		this(25);
		System.out.println("parent constructor: No args");
	}

	Parent(int x){
		this.x=x;
		System.out.println("parent constructor: one args");
	}
}
