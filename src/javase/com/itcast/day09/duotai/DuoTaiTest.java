package com.itcast.day09.duotai;

class AnimalTest{
	public void eat(){
		System.out.println("�Է�");
	}
}

class Dog2 extends AnimalTest{
	public void eat(){
		System.out.println("������");
	}
	public void lookDoor(){
		System.out.println("������");
	}
}

class Cat2 extends AnimalTest{
	public void eat(){
		System.out.println("è����");
	}
	public void playGame(){
		System.out.println("è׽�Բ�");
	}
}

public class DuoTaiTest {
	public static void main(String[] args){
		//����Ϊ��
		AnimalTest a =new Dog2();
		a.eat();
		System.out.println("--------------------------------------------------");
		
		//��ԭ�ɹ�
		Dog2 d = (Dog2)a;
		d.eat();
		d.lookDoor();
		System.out.println("--------------------------------------------------");
		
		//���è
		a =new Cat2();
		a.eat();
		System.out.println("--------------------------------------------------");
		
		//��ԭ��è
		Cat2 c = (Cat2)a;
		c.eat();
		c.playGame();
		System.out.println("--------------------------------------------------");
		
		//��ʾ���������
		//Dog dd = new Animal();
		//Dog ddd = new Cat();
	}
}
