package java001;

public class TestString1 {

	public static void main(String[] args)
	{
		String s = "AdaaaaABBBBdkajfdkfj4dasdWWSDS53#$#addasdfkjsakfls_kjdksADKDJ";
		int lCount = 0, uCount = 0, oCount = 0;
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(c >= 'a' && c <= 'z')
			{
				lCount++;
			}
			else if(c >= 'A' && c <= 'Z')
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
