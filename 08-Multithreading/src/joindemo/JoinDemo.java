package joindemo;

import java.util.Scanner;

public class JoinDemo extends Thread{
	private static int n, sum;

	public static void main(String[] args) {
		System.out.println("sum of first n numbers");
		System.out.println("enter a value");
		Scanner scanner = new Scanner(System.in);
		JoinDemo.n=scanner.nextInt();
		
		JoinDemo jd=new JoinDemo();
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sum of first"+ JoinDemo.n+"nymbers="+JoinDemo.sum);

		
	}
	@Override
	public void run() {
		for(int i=1;i<JoinDemo.n;i++) {
			JoinDemo.sum+=i;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
