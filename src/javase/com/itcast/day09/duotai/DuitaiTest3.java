package com.itcast.day09.duotai;

/*
 * ��̬�ĳ�Ա�����ص㣺
 * 		���������뿴��ߣ����п��ұ�
 * 
 * �̳е�ʱ��
 * 		�������к͸�����һ���ķ���������д
 * 		������û�и����г��ֹ��ķ����������ͼ̳й���
 */

class A{
	public void showA(){
		show2();
	}
	public void show2(){
		System.out.println("��");
	}
	
}
class B extends A{
	public void show2(){
		System.out.println("��");
	}
}
class C extends B{}

public class DuitaiTest3 {

}
