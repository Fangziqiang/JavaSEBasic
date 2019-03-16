package java001;

import java.util.Scanner;

public class TestString3 {

	public static void main(String[] args)
	{
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		Scanner X= new Scanner(System.in);
		String s= X.next();
		//String s = "AdaaaaABBBBdkajfdkfj4dasdWWSDS53#$#addasdfkjsakfls_kjdksADKDJ";
		int lCount = 0, uCount = 0, oCount = 0;
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(Character.isLowerCase(c))
			{
				lCount++;
			 }
			 else if(Character.isUpperCase(c))
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
