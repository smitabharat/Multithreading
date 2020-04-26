
public class Ex3Main 
{

	public static void main(String[] args) 
	{
		Ex3 e=new Ex3();
		Ex3 e1=new Ex3();
		Ex3 e2=new Ex3();
		
		e.setName("First Thread");
		e1.setName("Second Thread");
		e2.setName("Third Thread");
		
		e.start();
		e1.start();
		e2.start();

	}

}
