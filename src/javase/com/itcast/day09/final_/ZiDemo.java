package com.itcast.day09.final_;
/*
 * 继承的代码实现
 * 
 */

class Fu{
	public final void show(){
		System.out.println("这里是绝密资源，不允许改动");
	}
}
class Zi extends Fu{
	public void show2(){
		System.out.println("这里是一堆垃圾");
	}
}

class ZiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi zi = new Zi();
		zi.show();
		zi.show2();
	}

}
