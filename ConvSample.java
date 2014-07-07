public class ConvSample
{
	public static void main(String[] args)
	{
		byte b = 1;
		int i = 10;

		i = b;
		System.out.println(i);

		i = 258;
		b = (byte)i;
		System.out.println(b);
	}
}