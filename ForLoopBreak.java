public class ForLoopBreak
{
	public static void main(String[] args)
	{
        int intCount = 0;

        for(int i =0; i < 100; i = i + 1)
        {
            System.out.println(i);
        
            if(i % 7 == 0)
            {
                intCount = intCount + 1;
                System.out.println(intCount);
                if(intCount == 8)
                {
                    break;
                }        
            }
        
        }
	}

}
