package abc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kadai2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())] ; 
		System.out.println("数値を入力してください");

		String hen = br.readLine();
		String shu = br.readLine();
		
		int a = hen.length();
		int b = shu.length();
		
		int arr[][] = new int[a][a]; 
		System.out.println("変更前：");
			printArray(arr);
			int arr2[][] = new int[arr.length][arr.length];
			for (int i = 0; i < arr.length; i++) 
			{
				for (int j = 0; j < arr[i].length; j++) 
				{
					arr2[i][j] = arr[j][i];
				}
			}
				System.out.println("変更後：");
			printArray(arr2);
		}
		private static void printArray(int[][] arr) 
		{
			for (int i = 1; i < arr.length; i++) 
			{
				for (int j = 1; j < arr.length; j++) 
				{
					System.out.print(arr[i][j] + " ");
				}
			System.out.println();
			}
		}
}