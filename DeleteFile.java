import java.io.*;

public class DeleteFile
{
	public static void main(String[] args)
	{
        String f = args[0];
        
        File f = new File(f);
        
        if(f.delete())

        {
            System.out.println("ファイルを削除します。");
        }
        
        else

        {
            System.out.println("削除きませんでした。");
        }
	}
}
