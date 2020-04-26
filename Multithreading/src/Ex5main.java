
public class Ex5main
{

	public static void main(String[] args)
	{
	
		Ex5Join e=new Ex5Join();
		Ex5Thread2 e1=new Ex5Thread2(e);
		Ex5Thread3 e2=new Ex5Thread3(e1);
		
		e.start();
		e1.start();
		e2.start();
	}

}
