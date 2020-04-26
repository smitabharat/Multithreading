
public class Pattern 
{
	 static synchronized void displyPattern(char ch)
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
	
	
	 synchronized public void display3()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
