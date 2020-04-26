
public class Exth4 extends Thread
{
	Ex8MultipleMethods  p4;
	Exth4(Ex8MultipleMethods  p4)
	{
		this.p4=p4;
	}
	public void run()
	{
		p4.normal('*');
		p4.instance();
		p4.method();
		Ex8MultipleMethods.normal('!');
		
	}
}
