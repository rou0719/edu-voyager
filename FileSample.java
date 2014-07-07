import java.io.*;
// java.ioパケージを利用し、
// コマンドプロンプトから入力されたフォルダ内の
// ファイルおよびフォルダの一覧を表示するプログラムです。

public class FileSample
{
	public static void main(String[] args)
	{
        File f = new File(args[0]);

        // Fileクラスのインスタンスを作成する方法を教えてください。
        //（参考書に乗ってありません） 
        // Fileはクラスの意味？ f は変数？ new? 
      
        String[] fileList = f.list();

        // ここはStringデータ型で配列を作成するという意味だと思いますが、
        // new演算子は？要素数は？File f = new File(args[0]);のことですか？
        // 理解できません。

        for(int i = 0; i < fileList.length; i++)
        // ここは大丈夫です。

        {
            System.out.println(fileList[i]);
        }
	}
}
