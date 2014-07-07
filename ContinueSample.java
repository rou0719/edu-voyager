public class ContinueSample
{
	public static void main(String[] args)
	{
        int i = 0;
        while(i != 10)
        {
            System.out.println("continue‚Ì‘O");
        
            if(i % 2 == 0)
            {
                i++;
                continue;
            }
            System.out.println(i);
            System.out.println("continue‚ÌŒã‚ë");
            i++; 
        }
	}
}
