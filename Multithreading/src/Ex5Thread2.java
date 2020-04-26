
public class Ex5Thread2 extends Thread
{
	Thread t1;
	Ex5Thread2(Thread t1)
	{
		this.t1=t1;
	}
	public void run()
	{
		try
		{
			t1.join();
			//t1.join(10000);
			//t1.join(10000, 20000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("exam");
	}

}
