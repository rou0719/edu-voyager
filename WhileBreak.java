// �u0����99�܂ł̒l�ŁA7�Ŋ���؂��l��8�ɂȂ����烋�[�v�𔲂���v�Ƃ������̂ł��B

public class WhileBreak
{
	public static void main(String[] args)
	{
        int intCount = 0;
        int i = 0;

        while(i != 100)
        
        // �Q�l���ɂ́h�ufor(int i =0; i < 100; i = i + 1)�v�Ƃ��Ă��������́A
        // �uwhile(i != 100)�v�ƂȂ�B�h�Ə����Ă���܂��B
        // �����while�X�e�[�g�����g�ł����ʗp���Ȃ��ł����H
        // for�����g���v���O�����Ŏ��������_���ł����B �� for(i != ����)

        {
            System.out.println(i);
        
            if(i % 7 == 0)
            {
                intCount = intCount + 1;
                if(intCount == 8)
                {
                    break;
                }        
            }
            i++; 
        }
	}
}
