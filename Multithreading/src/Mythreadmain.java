
public class Mythreadmain 
{

	public static void main(String[] args) 
	{
		Mythread m=new Mythread();
		Mythread m1=new Mythread();
		m.setName("FirstThread");
		m1.setName("SecondThread");
		m.start();
		m1.start();
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}

	}

}
