import java.io.*;
import java.util.*;

public class FortuneSample
{
	public static void main(String[] args)
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("誕生月を入力してください");
        
        try
        {
            long lngMonth = Long.parseLong(br.readLine());

		    while(lngMonth >12 || lngMonth < 1)
            {
		        System.out.println("正しい値を入力してください");
            
                lngMonth = Long.parseLong(br.readLine());
            }
            long rndData = 0;
            //Date dateNow = new Date();

            Random r = new Random(System.currentTimeMillis() + lngMonth);

            rndData = Math.round(r.nextDouble() * 19 +1);

            if(rndData == 1)
            {
                System.out.println("\"大吉\"です");
            }else if(rndData >= 2 && rndData <= 4)
            {
                System.out.println("\"中吉\"です");
            }else if(rndData >= 5 && rndData <= 9)
            {
                System.out.println("\"大吉\"です");
            }else if(rndData >= 10 && rndData <= 17)
            {
                System.out.println("\"吉\"です");
            }else if(rndData >= 18 && rndData <= 19)
            {
                System.out.println("\"凶\"です");
            }else if(rndData == 20)
            {
                System.out.println("\"大凶\"です");
            }else
            {
                System.out.println("エラーが発生しました");
                System.out.println("rndDataの値は" + rndData);
            }
        }catch(IOException e)
        {
            System.out.println("入力値のエラー");
        }catch(NumberFormatException e)
        {
           System.out.println(e);
           System.out.println("整数を入力してください");
           System.out.println("プログラムを終了します");
        }
    }

}
