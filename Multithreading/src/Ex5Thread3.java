
public class Ex5Thread3 extends Thread
{
	Thread t2;
	Ex5Thread3(Thread t2)
	{
		this.t2=t2;
	}
	public void run()
	{
		try
		{
			t2.join();
			//t2.join(10000);
			//t2.join(10000, 20000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Result");
	}
	
}
