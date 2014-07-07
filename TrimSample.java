public class TrimSample
{
	public static void main(String[] args)
	{
        String s1 = " Space ";
        String s2 = "    Space    ";

        s1 = s1.trim();

		System.out.println("trimメソッドを使用して" + s1 + "となりました");
		System.out.println("trimメソッドを使用せず" + s2 + "となりました");

	}
}
