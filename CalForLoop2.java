public class CalForLoop2
{
	public static void main(String[] args)
	{
	    double ans = 0.0;
        
        for(int i = 1; i <= 10; i++)
       
        {
            ans = ans + 0.1 * 10;
        }
        ans = ans / 10;
        System.out.println(ans);
	}
}
