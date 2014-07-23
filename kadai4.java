package abc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kadai4
{
	public static void main(String[] args)
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("数値を入力してください");
		
		try {

			String hen = br.readLine();
			String shu = br.readLine();
			
			int a = hen.length();
			int b = shu.length();
			
			int arr[][] = new int[][] {{ 11, 22, 33 }, { 4, 5, 6 }, { 7, 8, 9 }}; 
			System.out.println("変更前：");
				//printArray(arr);
			
			private static void printArray(int[][] arr) 
			{
				for (int i = 0; i < arr.length; i++) 
				{
					for (int j = 0; j < arr.length; j++) 
					{
						System.out.print(arr[i][j] + " ");
					}
				System.out.println();
				}
			}
			
			
					
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}

	

	