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
        System.out.println("例外が発生しました");
        }
        finally
        {
            System.out.println("処理を終了しました");
        }
	}
}
