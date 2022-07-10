package multithreadingpackage;
class MyDaemon extends Thread
{}

public class DaemonThreadDemo {

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(false);
		MyDaemon d=new MyDaemon();
		System.out.println(d.isDaemon());
		d.setDaemon(true);
		System.out.println(d.isDaemon());

	}

}
