public class DoWhileSample
{
	public static void main(String[] args)
	{
        int i = 0;

        while(i == 1)
        {
		    System.out.println("Whileステートメントが実行されました");
        }
        do
        {
		    System.out.println("do-Whileステートメントが実行されました");
        }
        while(i == 1);
	}
}
