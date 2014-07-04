// 「0から99までの値で、7で割り切れる値が8つになったらループを抜ける」というものです。

public class WhileBreak
{
	public static void main(String[] args)
	{
        int intCount = 0;
        int i = 0;

        while(i != 100)
        
        // 参考書には”「for(int i =0; i < 100; i = i + 1)」としていた部分は、
        // 「while(i != 100)」となる。”と書いてあります。
        // これはwhileステートメントでしか通用しないですか？
        // for文を使うプログラムで試したがダメでした。 ⇒ for(i != 条件)

        {
            System.out.println(i);
        
            if(i % 7 == 0)
            {
                intCount = intCount + 1;
                if(intCount == 8)
                {
                    break;
                }        
            }
            i++; 
        }
	}
}
