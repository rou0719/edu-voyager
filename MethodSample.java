package abc;

public class MethodSample {
	public static void main(String[] args)
	{
		MethodSample m = new MethodSample();
		//int ans;
				
		int s = m.AddMethod(7);
		
		System.out.println("メソッドの結果は" + s + "です");
		
	}

	int AddMethod(int x)
	{
		return x * 10;
	}
}
