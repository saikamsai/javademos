package syncdemo;

public class Worker implements Runnable{
		
		Displaymsg dm;
		String name;
		
		Worker(Displaymsg dm, String name){
			this.dm=dm;
			this.name=name;
		}
		@Override
		public void run() {
			dm.sayHello(name);
		}

}
