import java.io.*;

public class WriteFile
{
	public static void main(String[] args)
	{
        String s = args[0];
        try

        {
            BufferedReader br = new BufferedReader

                    (new InputStreamReader(System.in));

            PrintWriter pw = new PrintWriter

                    (new BufferedWriter(new FileWriter(s, true)));

            String strData;

            strData = br.readLine();

            while(strData != null)
            {
                pw.println(strData);
                strData = br.readLine();
            }
            pw.close();

        }catch(IOException e)
        {
            System.out.println("ÉGÉâÅ[Ç™î≠ê∂ÇµÇ‹ÇµÇΩ");
        }    
	}
}
