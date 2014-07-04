public class IncrementSample
{
	public static void main(String[] args)
	{
        int i1 = 1;
        int i2 = 1;
        int i3 = 1;
        int j1 = 0;
        int j2 = 0;
        int j3 = 0;
        int j4 = 0;
        int j5 = 0;

        j1 = i1++ + 100;
        j2 = i1++ + 100;
        j3 = i1++ + 100;
        j4 = i1++ + 100;
        j5 = ++i2 + 100;

		System.out.println(j1);
        
		System.out.println(j2);
        
		System.out.println(j3);

		System.out.println(j4);
        
		System.out.println(j5);
	}
}
