
public class ProduThread1 extends Thread
{
	ProduceConsume p1;
	
	ProduThread1(ProduceConsume p1)
	{
		this.p1=p1;
		
	}
	public void run()
	{
		//p1.get();
		p1.put(5);
	}
	
	
}
