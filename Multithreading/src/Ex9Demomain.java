
public class Ex9Demomain 
{

	public static void main(String[] args) 
	{
		Ex9Circle c=new Ex9Circle();
		//c.input(23);
		//c.output();
		
		
		  new Thread() 
		  { 
			  public void run()
			  {
				  c.output();
			  } 
			  }
		  .start();
		  new Thread () 
		  {
		  public void run()
		  {
			  c.input(20);
			  }
		  }
		  .start();
		 
	}

	}


