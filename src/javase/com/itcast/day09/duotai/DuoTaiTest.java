package com.itcast.day09.duotai;

class Animal2{
	public void eat(){
		System.out.println("�Է�");
	}
}

class Dog2 extends Animal2{
	public void eat(){
		System.out.println("������");
	}
	
	public void lookDoor(){
		System.out.println("������");
	}
}

class Cat2 extends Animal2{
	public void eat(){
		System.out.println("è����");
	}
	
	public void playGame(){
		System.out.println("è׽�Բ�");
	}
}
public class DuoTaiTest {
	public static void main(String[] args){
		Animal2 a =new Dog();
		a.eat();
		System.out.println("--------------------------------------------------");
		
		//��ԭ�ɹ�
		Dog d = (Dog)a;
		d.eat();
		d.look
		
	}
}
