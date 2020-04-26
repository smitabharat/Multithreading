
public class Ex8th3 extends Thread
{
	Ex8MultipleMethods  p3;
	Ex8th3(Ex8MultipleMethods  p3)
	{
		this.p3=p3;
	}
	public void run()
	{
		p3.normal('$');
		p3.instance();
		p3.method();
		Ex8MultipleMethods.normal('"');
		
	}
}
