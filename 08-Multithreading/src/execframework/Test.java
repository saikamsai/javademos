package execframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) {
		
		String tname=Thread.currentThread().getName();
		System.out.println(tname+":main method begin");
		
		CheckProcessor [] cp=new CheckProcessor[4];
		cp[0] = new CheckProcessor("ATM");
		cp[1] = new CheckProcessor("Bank");
		cp[2] = new CheckProcessor("Web");
		cp[3] = new CheckProcessor("Mobile");
		
		ExecutorService fixedThreadPool=Executors.newFixedThreadPool(4);
		for (CheckProcessor x : cp) {
			fixedThreadPool.submit(x);
		}
	System.out.println(tname+ ":main method end");
	}

}
