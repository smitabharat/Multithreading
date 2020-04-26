
public class ProducerConsumer
{
	int n;
	boolean valueSet=false;
	synchronized void get()
	{
		if(!valueSet)
		{
			try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Exception caught");
		}}
		System.out.println("Got:"+n);
		valueSet=false;
		notify();
		//return n;
	}
	synchronized void put(int n)
	{
		if(valueSet)
		{try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Exception caught");
		}}
		this.n=n;
		valueSet=true;
		System.out.println("Put:"+n);
		notify();
	}
}
class Producer extends Thread
{
	ProducerConsumer q;
	Producer(ProducerConsumer q)
	{
		this.q=q;
		//new Thread(this,"Producer").start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
			
		}
	} 
}
class Consumer extends Thread
{
	ProducerConsumer q;
	Consumer(ProducerConsumer q)
	{
		this.q=q;
		//new Thread(this,"Consumer1").start();
		//new Thread(this,"Consumer2").start();
		
	}
	
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
}
class ProdCons
{
	public static void main(String[] args)
	{
		ProducerConsumer q1=new ProducerConsumer();
		Producer p1=new Producer(q1);
		Consumer c1=new Consumer(q1);
		
		p1.start();
		c1.start();
	
		//System.out.println("Press Control-c to stop");
	}
}

