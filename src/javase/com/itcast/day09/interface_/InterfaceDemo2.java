package com.itcast.day09.interface_;

/*
 * 接口成员特点：
 * 		成员变量：只能是常量，并且是静态的，默认修饰符：public static final
 * 		构造方法：接口没有构造方法
 *		成员方法：	
 * 		
 * 所有的类都默认继承
 * 由此可见：
 * 	A：具体类多态（几乎没有）
 *  B：抽象类多态（常用）
 *  C：接口多态（最常用）
 */

interface Inter{
	public int num = 10;
	public final int num2 = 20;
	public static final int num3 = 30;
	
	//错误：需要<标识符>，所以接口没有构造方法
//	public Inter(){}
	
	//接口方法不能带有主体
	public void show(){}
}

//接口名+Impl这种格式是接口的实现类格式
class InterImpl implements Inter{
	
}

//测试类
class InterfaceDemo2 {
	public static void main(String[] args){
		//创建对象
		Inter i = new InterImpl();
		System.out.println(i.num);
		System.out.println(i.num2);
//		i.num = 100;
//		i.num2 = 200;
//		System.out.println(i.num);//无法为最终变量num分配值
//		System.out.println(i.num2);//无法为最终变量num2分配值
		
	}
}
