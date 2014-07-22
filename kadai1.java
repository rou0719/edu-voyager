package abc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kadai1 
{
	public static void main(String[] args)
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("数値を入力してください");

		try
		{
			int ans = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= ans*ans; i++)
			{
				if(i >= 10)
				{
					System.out.print(i+ "  ");
					
				}else
				
					System.out.print(i + "   ");
				
				if(i % ans == 0)
				
				{
					System.out.println();
					System.out.println();
				}
			}
			
		}catch(IOException e)
		
		{
			System.out.println("error");
		}
	}
}
