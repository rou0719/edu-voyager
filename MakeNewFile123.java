import java.io.*;

public class MakeNewFile123
{
	public static void main(String[] args)
	{
        System.out.println("�t�@�C���������Ă�������");

        //String s = args[0];
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try

        {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String s = br.readLine();

            FileWriter fr = new FileWriter(s);

        }
        catch(IOException e)

        {
            System.out.println("�G���[���������܂���");
        }    


	}
}
