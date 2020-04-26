public class Ex4char extends Thread
{
	Thread t1;
	Ex4char(Thread t1)
	{
		this.t1=t1;
	}
	
	public void run()
	{
		try
		{
			t1.join();
			char ch='a';
			for(int i='a';i<='h';i++)
			{
				ch++;
			System.out.println(ch);
			}
		}
		
		catch(InterruptedException e)
		{
			e.getSuppressed();
		}
		
			}
		
	}

