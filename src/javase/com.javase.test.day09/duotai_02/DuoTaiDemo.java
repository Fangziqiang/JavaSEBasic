package duotai_02;

/*
 * 多态的前提：
 * 		A:要有继承关系
 * 		B:要有方法重写
 * 			其实没有也是可以的，但是如果没有这个就没有意义
 * 				动物 d = new 猫();
 * 				d.show();
 * 				动物 d = new 狗();
 * 				d.show();
 * 		C:要有父类引用指向子类对象
 * 			父 f = new 子();
 */		
 class Fu{
	 public void show(){
		 System.out.println("show Fu");
	 }
 }
 
 class Zi extends Fu{
	 public void show(){
		 System.out.println("show Zi");
	 }
 }
 
 class Zi2 extends Fu{
	 public void show() {
		 System.out.println("show Zi2");
	 }
 }
 
public class DuoTaiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fu f =new Fu();
		f.show();
		Fu f1 =new Zi();
		f1.show();
		
		Fu f2 = new Zi2();
		f2.show();
	}

}
