public class DivException
{
	public static void main(String[] args)
	{
        int ans = 0;

        try
        {
        ans = 3 / 0;
        System.out.println(ans);
        }
        catch(Exception e)
        {
        System.out.println("��O���������܂���");
        }
        finally
        {
            System.out.println("�������I�����܂���");
        }
	}
}
