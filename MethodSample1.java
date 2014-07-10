package abc;

public class MethodSample1 {
	public static void main(String[] args)
	{
		MethodSample m = new MethodSample();
		
				
		int s = m.AddMethod(7);
		
		System.out.println("メソッドの結果は" + s + "です");
		
	}

	int AddMethod(int x)
	{
		return x * 10;
	}
}
