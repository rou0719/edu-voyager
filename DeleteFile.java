import java.io.*;

public class DeleteFile
{
	public static void main(String[] args)
	{
        String f = args[0];
        
        File f = new File(f);
        
        if(f.delete())

        {
            System.out.println("�t�@�C�����폜���܂��B");
        }
        
        else

        {
            System.out.println("�폜���܂���ł����B");
        }
	}
}
