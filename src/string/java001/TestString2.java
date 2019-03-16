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
			//indexOf()的用法：返回字符中indexof（string）中字串string在父串中首次出现的位置，
//			从0开始！没有返回-1；方便判断和截取字符串！
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
