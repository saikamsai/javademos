package execframework;

public class CheckProcessor implements Runnable{
	String source;
	public CheckProcessor(String source) {
		this.source=source;
	}
	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": processing check from " + source + " started.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tname + ": processing check from " + source + " ended.");
		
	}


}
