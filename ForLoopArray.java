public class ForLoopArray
{
	public static void main(String[] args)
	{
        int iArray;
        iArray = args.length;

        for(int i = 0; i < iArray; i++)
        {
		System.out.println(args[i]);
        }
	}
}
