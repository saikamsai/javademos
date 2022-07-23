
public class MyThread1 extends Thread{
	public void run() {
		System.out.println("Thread started running...");
	}
	public static void main(String[] args) {
		MyThread1 m=new MyThread1();
		m.start();
		
	}

}
