
public class Ex9Circle 
{
	int radius=0;
	synchronized void input(int radius)
	{
		System.out.println("Input method");
		this.radius=radius;
		notify();
		System.out.println("hello");
	}
	
		synchronized void output()
		{
			System.out.println("Outer method");
			if(radius==0)
			{
				try
				{
					System.out.println("entering in waiting");
					wait();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			double area=3.14*radius*radius;
			System.out.println("Area="+area);
		}
}
