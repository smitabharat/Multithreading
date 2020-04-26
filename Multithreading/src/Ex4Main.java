
public class Ex4Main {

	public static void main(String[] args) 
	{
		//Thread t1=new Thread();
		Ex4num e=new Ex4num();
		Ex4char e1=new Ex4char(e);
		e.start();
		e1.start();

	}

}
