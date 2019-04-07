import java.util.Scanner;

public class insertSort2{
    	public static void main(String [] args){
    	int maxSize=10;
    	System.out.println("请输入要插入的整数");
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
	arrayIns arr;
	arr=new arrayIns(maxSize);
	arr.insert(77); arr.insert(99); arr.insert(44); arr.insert(55); arr.insert(22); arr.insert(88); arr.insert(11) ; arr.insert(00); arr.insert(66); arr.insert(33);
	arr.insert(x);
//	int j=0;
//	for(int i=0;i<maxSize;i++){
//	    if(arr.a[i]>0){
//		j++;
//	    }
//	}
//	if()
	arr.display();
	arr.insertionSort();
	arr.display();
    	}
}