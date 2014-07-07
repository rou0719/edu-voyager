import java.io.*;

public class PISample
{
	public static void main(String[] args)
	{
		System.out.println("”¼Œa‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            String s = br.readLine();
		    while(s != null)
            {
                double ans = Math.pow(Double.parseDouble(s), 2) * Math.PI;
                System.out.println("‰~‚Ì–ÊÏ‚Í" + ans + "‚Å‚·");
                s = br.readLine();
            }
        }
        catch(IOException e)
        {
		    System.out.println("ƒGƒ‰[‚ª”­¶‚µ‚Ü‚µ‚½");
        }
	}
}
