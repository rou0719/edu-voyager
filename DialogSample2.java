import java.io.*;

public class DialogSample2
{
	public static void main(String[] args)
	{
		System.out.println("お名前を入力してください");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            String s = br.readLine();
            //String br;
		    System.out.println(s + "さんこんにちは");
        }catch(Exception e)
        {
		    System.out.println("エラーが発生しました");
        }
	}
}
