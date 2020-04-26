
public class MyThread3 extends Thread
{
	Pattern p3;
	MyThread3(Pattern p3)
	{
		this.p3=p3;
	}
	
	
	public void run()
	{
		p3.displyPattern('&');
	}
	
	
	
	
	
}
