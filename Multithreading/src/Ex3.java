
public class Ex3 extends Thread
{

	public void run()
	{
		if(Thread.currentThread().getName()=="First Thread")
		{
			System.out.println("Sunday Monday Tuesday wednesday Thruesday Friday Satuerday");
		}
			else if(Thread.currentThread().getName()=="Second Thread")
			{
				
					for(int i=1;i<10;i++)
					{
						int sum=5*i;
						 System.out.println("5 range = "+sum);
					}
						
				
			}
					else if(Thread.currentThread().getName()=="Third Thread")
					{
						int f=0,s=1,fib;
						for(int i=0;i<10;i++)
						{
							
							fib=f+s;
							System.out.println(fib);
							f=s;
							s=fib;
					//System.out.println();
						}
						
					}
		}
	}

