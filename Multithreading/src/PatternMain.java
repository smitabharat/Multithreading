
public class PatternMain 
{

	public static void main(String[] args) 
	{
		Pattern p=new Pattern();
		Mythread1Pattern t1=new Mythread1Pattern(p);
		MyThread2Pattern t2=new MyThread2Pattern(p);
		
		t1.start();
		t2.start();
		
		MyThread3 t3=new MyThread3(new Pattern());
		t3.start();

	}

}
