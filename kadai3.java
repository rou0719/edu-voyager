package abc;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class kadai3 {
	public static void main(String[] args) { 
			int arr[][] = new int[][] {{ 11, 22, 33 }, { 4, 5, 6 }, { 7, 8, 9 }}; 
			System.out.println("変更前：");
				//printArray(arr);
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
				for (int i = 0; i < arr.length; i++) 
				{
					for (int j = 0; j < arr.length; j++) 
					{
						System.out.print(arr[i][j] + " ");
					}
				System.out.println();
				}
			}
	}