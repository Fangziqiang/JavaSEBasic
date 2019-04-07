package com.itcast.day09.duotai;
/*
 * ��̬�ĺô���
 * 		A��
 */

class Animal1{
	public void eat(){
		System.out.println("�Է�");
	}
	
	public void sleep(){
		System.out.println("˯��");
	}
}

class Cat1 extends Animal1{
	@Override
	public void eat(){
		System.out.println("è����");
	}
	
	@Override
	public void sleep(){
		System.out.println("èſ��˯��");
	}
}

class Dog1 extends Animal1{
	@Override
	public void eat(){
		System.out.println("���Թ�ͷ");
	}
	
	@Override
	public void sleep(){
		System.out.println("��վ��˯��");
	}
}

class Pig extends Animal1{
	@Override
	public void eat(){
		System.out.println("��԰ײ�");
	}
	
	@Override
	public void sleep(){
		System.out.println("�����˯");
	}
}

class AnimalTool{
	private AnimalTool(){
		
	}
	//����è�Ĺ���
	public static void useCat(Cat1 c){
		c.eat();
		c.sleep();
	}
	
	//���ù��Ĺ���
	public static void useDog(Dog1 d){
		d.eat();
		d.sleep();
	}
	
	public static void usePig(Pig p){
		p.eat();
		p.sleep();
	}
	
	public static void useAnimal(Animal1 a){
		a.eat();
		a.sleep();
	}
}

public class DuoTaiDemo2 {
	public static void main(String[] args){
		System.out.println("-----------��������----------------");
		//��ϲ��è��������һֻ
		Cat1 c1 = new Cat1();
		c1.eat();
		c1.sleep();
		
		//�Һ�ϲ��è�����ԣ�������һֻ
		Cat1 c2 = new Cat1();
		c2.eat();
		c2.sleep();
		
		Cat1 c3 = new Cat1();
		c3.eat();
		c3.sleep();
		
		//�������ˣ������˺ܶ�ֻè��ÿ�δ��������ǿ��Խ��ܵ�
		//�����أ����÷������㲻���ú������𣿽����Ƕ�������һ��
		//����׼���÷����Ľ�
//		userCat(c1);
//		userCat(c2);
//		userCat(c3);
		System.out.println("----------AnimalTool-useCat------------");
		AnimalTool.useCat(c1);
		AnimalTool.useCat(c2);
		AnimalTool.useCat(c3);
		
		//��ϲ����
		System.out.println("----------AnimalTool-useDog------------");
		Dog1 d1= new Dog1();
		Dog1 d2= new Dog1();
		Dog1 d3= new Dog1();
		AnimalTool.useDog(d1);
		AnimalTool.useDog(d2);
		AnimalTool.useDog(d3);
		
		//��ϲ��������
		System.out.println("----------AnimalTool-usePig------------");
		Pig p1= new Pig();
		Pig p2= new Pig();
		Pig p3= new Pig();
		AnimalTool.usePig(p1);
		AnimalTool.usePig(p2);
		AnimalTool.usePig(p3);
		
		System.out.println("----------AnimalTool-useAnimal------------");
		AnimalTool.useAnimal(c1);
		c1.eat();
		c1.sleep();
	}
	
	
	/*
	//����è�Ĺ���
	public static void userCat(Cat1 c){
		c.eat();
		c.sleep();
	}
	
	//���ù��Ĺ���
		public static void userDog(Dog1 d){
			d.eat();
			d.sleep();
		}
	*/
}
