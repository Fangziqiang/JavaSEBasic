package com.itcast.day09.chouxiang;

/*
 * 		������ĳ�Ա�ص㣺
 * 			��Ա�������ȿ����Ǳ�����Ҳ�����Ǳ���
 * 			���췽�����С��������෽λ�������ݵĳ�ʼ��
 * 			��Ա�������ȿ����ǳ���ģ�Ҳ�����Ƿǳ����
 * 
 * 		������ĳ�Ա�������ԣ�
 * 		A�����󷽷� 
 * 		B��
 */

abstract class Animal{
	public int num = 10;
	public final int num2 =20;
	
	public Animal(){}
	
	public Animal(String name,int age){}
	
	public abstract void show();
	
	
}

class Dog extends Animal{
	
}

public class AbstractDemo2 {
	public static void main(String[] args){
		//��������
	}
}
