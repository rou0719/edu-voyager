import java.io.*;
import java.util.*;

public class FortuneSample
{
	public static void main(String[] args)
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("�a��������͂��Ă�������");
        
        try
        {
            long lngMonth = Long.parseLong(br.readLine());

		    while(lngMonth >12 || lngMonth < 1)
            {
		        System.out.println("�������l����͂��Ă�������");
            
                lngMonth = Long.parseLong(br.readLine());
            }
            long rndData = 0;
            //Date dateNow = new Date();

            Random r = new Random(System.currentTimeMillis() + lngMonth);

            rndData = Math.round(r.nextDouble() * 19 +1);

            if(rndData == 1)
            {
                System.out.println("\"��g\"�ł�");
            }else if(rndData >= 2 && rndData <= 4)
            {
                System.out.println("\"���g\"�ł�");
            }else if(rndData >= 5 && rndData <= 9)
            {
                System.out.println("\"��g\"�ł�");
            }else if(rndData >= 10 && rndData <= 17)
            {
                System.out.println("\"�g\"�ł�");
            }else if(rndData >= 18 && rndData <= 19)
            {
                System.out.println("\"��\"�ł�");
            }else if(rndData == 20)
            {
                System.out.println("\"�勥\"�ł�");
            }else
            {
                System.out.println("�G���[���������܂���");
                System.out.println("rndData�̒l��" + rndData);
            }
        }catch(IOException e)
        {
            System.out.println("���͒l�̃G���[");
        }catch(NumberFormatException e)
        {
           System.out.println(e);
           System.out.println("��������͂��Ă�������");
           System.out.println("�v���O�������I�����܂�");
        }
    }

}