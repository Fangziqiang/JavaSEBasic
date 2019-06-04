package com.itcast.day09.interface_;

/*
 * 接口的特点：
 * 		A：接口用关键字interface表示
 * 			interface 接口名{}
 * 		B：类实现接口用implements表示
 * 			class 类名 implements 接口名 {}
 * 		C：接口不能实例化
 * 			那么，接口如何实例化呢？
 * 			按照多态的方式来实例化。
 * 
 * 由此可见：
 * 	A：具体类多态（几乎没有）
 *  B：抽象类多态（常用）
 *  C：接口多态（最常用）
 */
//定义动物培训接口
interface AnimalTrain{
	public abstract void jump();
}



class InterfaceDemo {
	public static void main(String[] args){
		AnimalTrain at = new AnimalTrain();
		at.jump();
	}
}
