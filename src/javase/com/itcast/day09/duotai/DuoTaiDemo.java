package com.itcast.day09.duotai;

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
 * 
 * 		多态中的成员访问特点：
 * 		A：成员变量
 * 			编译看左边，运行看左边
 * 		B：构造方法
 * 			创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化
 * 		C：成员方法
 * 			编译看左边，运行看右边
 * 		D：静态方法（静态和类相关，所有访问的还是左边）
 * 			编译看左边，运行看左边			
 */		
 class Fu{
	 public int num = 100;
	 public void show(){
		 System.out.println("成员方法：show Fu");
	 }
	 
	 public static void funcation(){
		 System.out.println("静态方法：funcation FU");
	 }
 }
 
 class Zi extends Fu{
	 public int num = 1000;
	 public int num2 = 200;
	 
	 @Override
	public void show(){
		 System.out.println("成员方法：show Zi");
	 }
	 
	 public static void funcation(){
		 System.out.println("静态方法：funcation Zi");
	 }
	 
	 public void method(){
		 System.out.println("method zi");
	 }
 }
 

public class DuoTaiDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fu f =new Fu();
//		f.show();
		Fu f1 =new Zi();
		//成员方法：编译看左边，运行看右边
		f1.show();
		//找不到符号
		//f1.method();
		
		//静态方法：编译看左边，运行看左边
		Fu.funcation();
		
		//成员变量：编译看左边，运行看左边，所以打印的num值为100
		System.out.println("成员变量："+f1.num);
		//找不到符号
		//System.out.println(f1.num2);
		Zi z = (Zi)f1;
		z.method();
	}

}
