public class CompString
{
	public static void main(String[] args)
	{
        String  s1 = "abc";
        String  s2 = "abcde";

        if(s1 == s2.substring(0, 3))
        {        
		    System.out.println(" [==] �̌��ʂ�true�ł�");
        }
        else
        {
            System.out.println(" [==] �̌��ʂ�false�ł�");
        }

        if(s1.equals(s2.substring(0, 2)))
        {        
		    System.out.println(" [equals] �̌��ʂ�true�ł�");
        }
        else
        {
            System.out.println(" [equals] �̌��ʂ�false�ł�");
        }
	}
}