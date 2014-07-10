package abc;

public class AccessSample {
	public static void main(String[] args)
	{
		PrivateMethod p = new PrivateMethod();
		
		int i = p.PrivateSample();
		System.out.println(i);	
	}
}
class PrivateMethod
{
	int PrivateSample()
	//private int PrivateSample()
	{
		return 10;
	}
}