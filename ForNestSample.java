public class ForNestSample
{
	public static void main(String[] args)
	{
        //System.out.println(0);
            
        //for(int row = 1; row <= 5; row++)
        int row = 0;
        while(row != 5)
       
        {
            System.out.print(row);


            for(int col = 0; col< row;col++)
            {
                System.out.print(1);
            }


            System.out.println();
            row++;
        }
	}
}
/*
 * 0
 *11
 *112
 *1113
 *11114
 *111115
 *とういう物を作りました。
 * 
 *質問：
 *0
 *11
 *211
 *3111
 *41111
 *511111
 *にしたい場合はどうすればいいですか？
 */
