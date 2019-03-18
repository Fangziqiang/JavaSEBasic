package test;
import java.util.Scanner;  

public class test {  
    public static void main(String[] args){  
        Scanner input=new Scanner(System.in);  
        System.out.print("请输入一串大写字母: ");  
       String s=input.nextLine();  
        //System.out.println("输入需要转换的字符串");  
        //Scanner sscScanner1 = new Scanner(System.in);  
        //String sstrString1 = sscScanner1.next();  
        //char cchar[] = s.toCharArray();  
//        for (int i = 0; i < cchar.length; i++) { 
//        	System.out.println(cchar[i]+"-->"+cchar[i]); 
       // int[] counts=countLetters(s.toUpperCase());  
            int[] c = new int[5];
            for(int i=0;i<5;i++){
            	System.out.println("c["+i+"]="+c[i]);
            }
        	int [] counts=countLetters(s);  
        	for(int i=0;i<counts.length;i++){  
        		if(counts[i]!=0)  
        			System.out.println((char)('A'+i)+" 共出现 "+counts[i]+"次");  
        	}     
       }  
    public static int[] countLetters(String s){  
        int[] counts=new int[67];
        for(int i=0;i<s.length();i++){  
        	//Character.isUpperCase
        	//Character.isLowerCase
            if(Character.isLetter(s.charAt(i)))  
                counts[s.charAt(i)-'A']++;  
            else{
            	//counts[s.charAt(i)-'A']++;
            	System.out.println(s.charAt(i)+"不是字母");
            }
        }  
       return counts;  
   }  
} 