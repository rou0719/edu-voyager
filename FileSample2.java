import java.io.*;

public class FileSample2
{
	public static void main(String[] args)
	{
        System.out.println("ファイル名を入力してください");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try
            {        

                String s ;
                s = br.readLine();

                s = s.list();

                System.out.println(s);
            }
            catch(IOException e)
            {        
                    System.out.println("エラー");
            }
     }
}
