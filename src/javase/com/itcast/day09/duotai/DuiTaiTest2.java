package com.itcast.day09.duotai;

/*
 * ��ͬ�ط���ʳ�Ļ���ͬ�İ���
 */

class Person{
	public void eat(){
		System.out.println("�Է�");
	}
}

class SourthPerson extends Person{
	public void eat(){
		System.out.println("���ˣ����׷�");
	}
	public void business(){
		System.out.println("����");
	}
}

class NorthPerson extends Person{
	public void eat(){
		System.out.println("���ˣ�����ͷ");
	}
	public void yanJiu(){
		System.out.println("�о�");
	}
}

public class DuiTaiTest2 {
	public static void main(String[] args){
		//����
		//�Ϸ���
		Person p = new SourthPerson();
		p.eat();
		System.out.println("-------------------------------------------");
		SourthPerson sp = (SourthPerson)p;
		sp.eat();
		sp.business();
		System.out.println("-------------------------------------------");
		
		//������
		p = new NorthPerson();
		p.eat();
		System.out.println("-------------------------------------------");
		NorthPerson np = (NorthPerson)p;
		np.eat();
		np.yanJiu();
	}
}
