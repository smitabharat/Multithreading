
public class Ex2Main 
{

	public static void main(String[] args)
	{
		Ex2UseRunnableInterface v=new Ex2UseRunnableInterface();
		Ex2UseRunnableInterface v1=new Ex2UseRunnableInterface();
		
		Thread t=new Thread(v);
		Thread t1=new Thread(v1);
		
		t.start();
		t1.start();

	}

}
