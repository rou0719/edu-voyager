public class MathSample
{
	public static void main(String[] args)
	{
        int [] intArray;
        intArray = new int[args.length];
        int intMax;

        for(int i = 0; i < args.length; i++)
        {
            intArray[i] = Integer.parseInt(args[i]);
        }
        intMax = intArray[0];

        for(int i = 0; i < intArray.length; i++)
        {
            intMax = Math.max(intMax, intArray[i]);
        }

		System.out.println("Å‘å’l‚Í" + intMax + "‚Å‚·");

	}
}
