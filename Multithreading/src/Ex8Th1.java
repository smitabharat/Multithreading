
public class Ex8Th1 extends Thread
{

	Ex8MultipleMethods  p1;
	Ex8Th1(Ex8MultipleMethods  p1)
	{
		this.p1=p1;
	}
	public void run()
	{
		p1.normal('*');
		p1.instance();
		p1.method();
		Ex8MultipleMethods.normal('%');
		
		
	}
	
}
