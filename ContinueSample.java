public class ContinueSample
{
	public static void main(String[] args)
	{
        int i = 0;
        while(i != 10)
        {
            System.out.println("continue�̑O");
        
            if(i % 2 == 0)
            {
                i++;
                continue;
            }
            System.out.println(i);
            System.out.println("continue�̌��");
            i++; 
        }
	}
}
