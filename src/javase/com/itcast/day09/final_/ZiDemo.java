package com.itcast.day09.final_;
/*
 * �̳еĴ���ʵ��
 * 
 */

class Fu{
	public final void show(){
		System.out.println("�����Ǿ�����Դ��������Ķ�");
	}
}
class Zi extends Fu{
	public void show2(){
		System.out.println("������һ������");
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
