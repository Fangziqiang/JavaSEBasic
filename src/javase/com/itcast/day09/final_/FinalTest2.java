package com.itcast.day09.final_;

/*
 * 	final修饰变量的初始化时机
 * 		A：被final修饰的变量只能赋值一次
 * 		B：在构造方法完毕前。（非静态的变量）
 */

class Demo{
	int num =10;
	final int num2=20;
	public Demo(){
		num =100;
		//无法为最终变量num2分配值
//		num2 = 200;
	}
}

public class FinalTest2 {
	public static void main(String[] args){
		Demo d = new Demo();
		//num = 100
		System.out.println(d.num);
	}
}
