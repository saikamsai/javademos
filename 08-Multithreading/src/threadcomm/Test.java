package threadcomm;

import javax.print.DocFlavor.STRING;

public class Test {
	public static void main(String[] args) {
		String tname=Thread.currentThread().getName();
		System.out.println(tname+":Main method begin");
		Worker w= new Worker();
		Thread w1= new Thread(w);
		w1.setName("W1");
		w1.start();
		synchronized (w1) {
			System.out.println(tname+":waiting..");
			try {
				w1.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(tname+":notified");
			System.out.println(tname+":total = "+w.getTotal());
		}
		System.out.println(tname+":main method end");
		
	}

}
