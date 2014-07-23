package abc;

public class Sample10 {
	public static void main(String[] args){
		
		int test[][] = {
				{80, 60, 22, 50, 75},
				{90, 55, 68, 72, 58}
			 };
		
		for(int i= 0; i < 5; i++){
		  System.out.println((i+1) + "番目の人の国語の点数は" + test[0][i] + "です。");
			
		  System.out.println((i+1) + "番目の人の数学の点数は" + test[1][i] + "です。");
			
		  System.out.println();
		}
	}	
}
