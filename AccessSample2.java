package abc;

public class AccessSample2 {
	public static void main(String[] args)
	{
		PrivateMethod2 p = new PrivateMethod2();
		
		int i = p.i;
		System.out.println(i);	
	}
}
class PrivateMethod2
{
	protected int i = 10;
	//private int i = 10;
	//int PrivateSample()
	private int PrivateSample()
	{
		return 10;
	}
}