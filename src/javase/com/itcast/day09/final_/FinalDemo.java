package com.itcast.day09.final_;
/*
 * final���������ࡢ����������
 * �ص㣺
 * 		final���������࣬���಻�ܱ��̳С�
 * 		final�������η������÷������ܱ���д
 * 		final�������α������ñ������ܱ����¸�ֵ,��Ϊ�ñ�����ʵ���ǳ���
 * ������
 * 		A������ֵ����
 * 			"hello",10,true
 * 		B���Զ��峣��
 * 			final int x = 10;
 */		
class Fu2{
	public int num=10;
	public final int num2=10;
	public final void show(){
		System.out.println("�����Ǿ�����Դ��������Ķ�");
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
