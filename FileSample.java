import java.io.*;
// java.io�p�P�[�W�𗘗p���A
// �R�}���h�v�����v�g������͂��ꂽ�t�H���_����
// �t�@�C������уt�H���_�̈ꗗ��\������v���O�����ł��B

public class FileSample
{
	public static void main(String[] args)
	{
        File f = new File(args[0]);

        // File�N���X�̃C���X�^���X���쐬������@�������Ă��������B
        //�i�Q�l���ɏ���Ă���܂���j 
        // File�̓N���X�̈Ӗ��H f �͕ϐ��H new? 
      
        String[] fileList = f.list();

        // ������String�f�[�^�^�Ŕz����쐬����Ƃ����Ӗ����Ǝv���܂����A
        // new���Z�q�́H�v�f���́HFile f = new File(args[0]);�̂��Ƃł����H
        // �����ł��܂���B

        for(int i = 0; i < fileList.length; i++)
        // �����͑��v�ł��B

        {
            System.out.println(fileList[i]);
        }
	}
}
