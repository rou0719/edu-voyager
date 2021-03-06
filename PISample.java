import java.io.*;

public class PISample
{
	public static void main(String[] args)
	{
		System.out.println("半径を入力してください");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            String s = br.readLine();
		    while(s != null)
            {
                double ans = Math.pow(Double.parseDouble(s), 2) * Math.PI;
                System.out.println("円の面積は" + ans + "です");
                s = br.readLine();
            }
        }
        catch(IOException e)
        {
		    System.out.println("エラーが発生しました");
        }
	}
}
