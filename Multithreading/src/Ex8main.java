
public class Ex8main 
{

	public static void main(String[] args)
	{
		Ex8MultipleMethods p=new Ex8MultipleMethods();
		Ex8Th1 e=new Ex8Th1(p);
		Ex8th2 e1=new Ex8th2(p);
		Ex8th3 e2=new Ex8th3(p);
		Exth4 e3=new Exth4(p);
		
		e.start();
		e1.start();
		e2.start();
		e3.start();
		
		

	}

}
