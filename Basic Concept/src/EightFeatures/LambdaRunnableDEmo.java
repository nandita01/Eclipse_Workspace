package EightFeatures;
class ThreadDemo implements Runnable
{
	public void run()
	{
		System.out.println("run method called");
	}
	}

public class LambdaRunnableDEmo {

	public static void main(String[] args) {
		Thread thread=new Thread(new ThreadDemo());
		thread.start();
		
//		Runnable runnable=()->
//		{
//			System.out.println("run method using Lambda");
//		};
//		Thread ThreadLambda=new Thread(runnable);
		Thread ThreadLambda=new Thread(()->System.out.println("run method using Lambda"));
		ThreadLambda.start();

	}

}
