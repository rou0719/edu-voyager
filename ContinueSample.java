public class ContinueSample
{
	public static void main(String[] args)
	{
        int i = 0;
        while(i != 10)
        {
            System.out.println("continueの前");
        
            if(i % 2 == 0)
            {
                i++;
                continue;
            }
            System.out.println(i);
            System.out.println("continueの後ろ");
            i++; 
        }
	}
}
