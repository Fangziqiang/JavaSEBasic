
import java.util.Scanner;

public class arry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入字符串");
		Scanner s= new Scanner(System.in);
		String sstrString1 = s.next();  
		//Scanner sscScanner1 = new Scanner(System.in);  
		char cchar[] = sstrString1.toCharArray();  
        for (int i = 0; i < cchar.length; i++) {  
        	System.out.println("cchar["+i+"]"+"-->"+cchar[i]);
        }
//        for(int i=0;i<counts.length;i++){  
//            if(counts[i]!=0)  
//                System.out.println((char)('A'+i)+" 共出现 "+counts[i]+"次");  
//        }  
	}

}
