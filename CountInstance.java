package abc;

public class CountInstance 
{
	public static void main(String[] args)
	{
		//int i_count;
		 
		//varSample v1 = new varSample();
		CountInstance v1 = new CountInstance();	
		
		//i_count = varSample.s_method();
		int i_count = v1.s_method(2 );
		
		System.out.println("インスタンスの数は、" + i_count);
		
		
		//varSample v2 = new varSample();package abc;


		//CountInstance v2 = new CountInstance();
		//i_count = varSample.s_method();
		//i_count = v2.s_methdo(2);
		//System.out.println("インスタンスの数は、" + i_count);
	}
//}

//class varSample
//{
//	static int i = 0;
	
		//varSample()
		//{
		//	i = i + 1;
		//}
		
		//static int s_method()
		int s_method(int i)
		{
			return i + 1;
		}	
			
}
