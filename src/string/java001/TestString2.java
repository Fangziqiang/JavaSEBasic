package java001;

public class TestString2 {

	public static void main(String[] args)
	{
		String s = "AdaaaaABBBBdkajfdkfj4dasdWWSDS53#$#addasdfkjsakfls_kjdksADKDJ";
		int lCount = 0, uCount = 0, oCount = 0;
		String sL = "abcdefghijklmnopqrstuvwxyz";
		String sU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i <s.length(); i++)
		{
			char c = s.charAt(i);
			//indexOf()���÷��������ַ���indexof��string�����ִ�string�ڸ������״γ��ֵ�λ�ã�
//			��0��ʼ��û�з���-1�������жϺͽ�ȡ�ַ�����
			if(sL.indexOf(c) != -1)
			{
				lCount++;
			}
			else if(sU.indexOf(c) != -1)
			{
				uCount++;
			}
			else
			{
				oCount++;
			}
		}
	 System.out.println(lCount + " " + uCount + " " + oCount);
	}

}
