import java.io.*;

public class DialogSample2
{
	public static void main(String[] args)
	{
		System.out.println("�����O����͂��Ă�������");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            String s = br.readLine();
            //String br;
		    System.out.println(s + "���񂱂�ɂ���");
        }catch(Exception e)
        {
		    System.out.println("�G���[���������܂���");
        }
	}
}