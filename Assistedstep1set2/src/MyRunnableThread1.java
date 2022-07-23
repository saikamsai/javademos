
public class MyRunnableThread1 implements Runnable{
	public static int count=0;
	public MyRunnableThread1() {
		
	}
	public void run() {
		while(MyRunnableThread1.count<=10) {
			try {
				System.out.println("Exceptional Thread: "+(++MyRunnableThread1.count));
			Thread.sleep(100);
			
			}catch(InterruptedException e) {
				System.out.println("Exception in thread: "+e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Starting main thread..");
		MyRunnableThread1 m= new MyRunnableThread1();
		Thread t=new Thread(m);
		t.start();
		while(MyRunnableThread1.count<=10) {
			try {
				System.out.println("main thread: "+(++MyRunnableThread1.count));
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println("Exception in main thread: "+e.getMessage());
			}
		}
		System.out.println("End of the main thread...");
    
	}

}
