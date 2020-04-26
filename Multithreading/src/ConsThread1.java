
public class ConsThread1 extends Thread
{
ProduceConsume p2;
	
	ConsThread1(ProduceConsume p2)
	{
		this.p2=p2;
		
	}
	public void run()
	{
		p2.get();
		//p2.put(5);
	}
}
