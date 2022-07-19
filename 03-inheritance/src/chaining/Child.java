package chaining;

public class Child extends Parent{
Child(){
	System.out.println("chaild constructor: no args");
}

Child(int x){
	super(x);
	System.out.println("child constructor: one args"); 
}
}
