
public class Ex8MultipleMethods 
{

	static void normal(char ch)
	{
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	  synchronized void instance()
	{
		char ch=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	public void  normal()
	{
		int ch=1;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	 static synchronized void method()
	{
		int ch=2;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	}


