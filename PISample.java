import java.io.*;

public class PISample
{
	public static void main(String[] args)
	{
		System.out.println("���a����͂��Ă�������");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            String s = br.readLine();
		    while(s != null)
            {
                double ans = Math.pow(Double.parseDouble(s), 2) * Math.PI;
                System.out.println("�~�̖ʐς�" + ans + "�ł�");
                s = br.readLine();
            }
        }
        catch(IOException e)
        {
		    System.out.println("�G���[���������܂���");
        }
	}
}
