/**
 * 
 */
/**
 * @author Administrator
 * ������ĸ�����
 * 		���ﲻӦ�ö���Ϊ����Ķ��������Ҷ����еĳԣ�˯��Ҳ��Ӧ���Ǿ����
 * 		���ǰ�һ�����Ǿ���Ĺ��ܳ�Ϊ����Ĺ��ܣ���һ����������г���Ĺ��ܣ���������ǳ����ࡣ
 *
 *	��������ص㣺
 *		A��������ͳ��󷽷�������abstract�ؼ��֡�
 *		B���������в�һ���г��󷽷��������г��󷽷�������붨��Ϊ������
 *		C�������಻��ʵ����
 *			��Ϊ�����Ǿ���ġ�
 *			�������й��췽�������ǲ���ʵ���������췽����������ʲô�أ�
 *			����������ʸ������ݵĳ�ʼ��
 *		D�������������
 *			a���������д���󷽷�����������һ��������
 *			b����д���еĳ��󷽷������ʱ��������һ���������
 *
 *		�������ʵ������ʵ�ǿ����������ʵ�ֵġ��Ƕ�̬�ķ�ʽ
 */
package com.itcast.day09.chouxiang;

abstract class Animal{
	//���󷽷�
	//public abstract void eat(){}//�շ����壬����ᱨ�����󷽷����������塣
	public abstract void eat();
	
//	���췽��
	public Animal(){}
}

//�����ǳ�����
abstract class Dog extends Animal{};

//����cat���ǳ�����
//class Cat extends Animal{};
//�����Ǿ����࣬��д���󷽷�
class Cat extends Animal{
	public void eat(){
		System.out.println("è����");
	}
}

class AbstractDemo{
	public static void main(String[] args){
		//��������
		//Animal�ǳ���ģ��޷�ʵ����
		//Animal a = new Animal();
//		ͨ����̬�ķ�ʽ��������
		Animal a = new Cat();
		a.eat();
	}
	
}