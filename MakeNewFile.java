import java.io.*;

public class MakeNewFile
{
	public static void main(String[] args)
	{
        String s = args[0];
        try

        {
           // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            FileWriter fr = new FileWriter(s);

        }catch(IOException e)
        {
            System.out.println("ÉGÉâÅ[Ç™î≠ê∂ÇµÇ‹ÇµÇΩ");
        }    


	}
}
