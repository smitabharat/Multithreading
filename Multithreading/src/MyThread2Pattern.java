
public class MyThread2Pattern extends Thread
{

	Pattern p2;
	MyThread2Pattern(Pattern p2)
	{
		this.p2=p2;
	}
	public void run()
	{
		p2.displyPattern('@');
	}
	
}
