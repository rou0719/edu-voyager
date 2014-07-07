import java.io.*;

public class ReadFile
{
	public static void main(String[] args)
	{
        String s = args[0];
        try

        {
            BufferedReader br = new BufferedReader

                    (new FileReader(s));
            
            String strData;
            strData = br.readLine();
            while(strData != null)
            {
                System.out.println(strData);
                strData = br.readLine();
            }
            br.close();

        }
            catch(FileNotFoundException e)
        {
            System.out.println("ファイルが見つかりません");
        }
            catch(IOException e)
        {
            System.out.println(e);
        }
	}
}
