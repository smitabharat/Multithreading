
public class ProduConsuMain {

	public static void main(String[] args)
	{
		ProduceConsume p11=new ProduceConsume();
		
		ProduThread1 e=new ProduThread1(p11);
		ConsThread1 e1=new ConsThread1(p11);
		
		e.start();
		e1.start();
		

	}

}
