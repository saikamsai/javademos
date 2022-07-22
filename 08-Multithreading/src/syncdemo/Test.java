package syncdemo;

public class Test {

	public static void main(String[] args) {
		
		String tname=Thread.currentThread().getName();
		System.out.println(tname+":main method begin");
		
		Displaymsg dm=new Displaymsg();
		
		Thread t1= new Thread(new Worker(dm,"steve"));
		t1.setName("t1");
		
		Thread t2=new Thread(new Worker(dm, "max"));
		t2.setName("t2");
		
		Thread t3=new Thread(new Worker(dm, "sai"));
		t3.setName("t3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(tname+":main method end");
		
		

	}

}
