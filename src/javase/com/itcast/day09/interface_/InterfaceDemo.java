package com.itcast.day09.interface_;

/*
 * �ӿڵ��ص㣺
 * 		A���ӿ��ùؼ���interface��ʾ
 * 			interface �ӿ���{}
 * 		B����ʵ�ֽӿ���implements��ʾ
 * 			class ���� implements �ӿ��� {}
 * 		C���ӿڲ���ʵ����
 * 			��ô���ӿ����ʵ�����أ�
 * 			���ն�̬�ķ�ʽ��ʵ������
 * 		D:�ӿڵ�����
 * 			a:�����ǳ����࣬�������岻��
 * 			b:�����Ǿ����࣬Ҫ��д�ӿ������еĳ��󷽷�
 * 			
 * 
 * �ɴ˿ɼ���
 * 	A���������̬������û�У�
 *  B���������̬�����ã�
 *  C���ӿڶ�̬����ã�
 */
//���嶯����ѵ�ӿ�
interface AnimalTrain{
	public abstract void jump();
}

//������ʵ�ֽӿ�
abstract class Dog implements AnimalTrain{	
}

//������ʵ�ֽӿ�
class Cat implements AnimalTrain{
	public void jump(){
		System.out.println("è����������");
	}
}

class InterfaceDemo {
	public static void main(String[] args){
		//AnimalTrain�ǳ���ģ��޷�ʵ����
		//AnimalTrain at = new AnimalTrain();
		//at.jump();
		AnimalTrain at = new Cat();
		at.jump();
	}
}
