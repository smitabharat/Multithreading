
public class Ex8th2 extends Thread 
{

	Ex8MultipleMethods  p2;
 Ex8th2(Ex8MultipleMethods  p2)
	{
		this.p2=p2;
	}
	public void run()
	{
		p2.normal('#');
		p2.instance();
		p2.method();
		Ex8MultipleMethods.normal(':');
		
	}
}
