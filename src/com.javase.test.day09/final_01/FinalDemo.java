package final_01;
/*
 * final可以修饰类、方法，变量
 * 特点：
 * 		final可以修饰类，该类不能被继承。
 * 		final可以修饰方法，该方法不能被重写
 * 		final可以修饰变量，该变量不能被重新赋值,因为该变量其实就是常量
 * 常量：
 * 		A：字面值常量
 * 			"hello",10,true
 * 		B：自定义常量
 * 			final int x = 10;
 */		
class Fu2{
	public int num=10;
	public final int num2=10;
	public final void show(){
		System.out.println("这里是绝密资源，不允许改动");
	}
}
class Zi2 extends Fu2{
	public void show2(){
		num=100;
		int num2=200;
		System.out.println(num);
		System.out.println(num2);
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi2 zi =new Zi2();
		zi.show2();
	}

}
