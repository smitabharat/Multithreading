
public class Mythread1Pattern extends Thread
{
	Pattern p1;
	Mythread1Pattern(Pattern p1)
	{
		this.p1=p1;
	}
	public void run()
	{
		p1.displyPattern('*');
	}
	
		
	}
	


