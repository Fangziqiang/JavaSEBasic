package test;
import java.util.Scanner;  

public class test {  
    public static void main(String[] args){  
        Scanner input=new Scanner(System.in);  
        System.out.print("������һ����д��ĸ: ");  
       String s=input.nextLine();  
        //System.out.println("������Ҫת�����ַ���");  
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
        			System.out.println((char)('A'+i)+" ������ "+counts[i]+"��");  
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
            	System.out.println(s.charAt(i)+"������ĸ");
            }
        }  
       return counts;  
   }  
} 