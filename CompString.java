public class CompString
{
	public static void main(String[] args)
	{
        String  s1 = "abc";
        String  s2 = "abcde";

        if(s1 == s2.substring(0, 3))
        {        
		    System.out.println(" [==] の結果はtrueです");
        }
        else
        {
            System.out.println(" [==] の結果はfalseです");
        }

        if(s1.equals(s2.substring(0, 2)))
        {        
		    System.out.println(" [equals] の結果はtrueです");
        }
        else
        {
            System.out.println(" [equals] の結果はfalseです");
        }
	}
}
