package com.itcast.day09.final_;

/*
 * 	final���α����ĳ�ʼ��ʱ��
 * 		A����final���εı���ֻ�ܸ�ֵһ��
 * 		B���ڹ��췽�����ǰ�����Ǿ�̬�ı�����
 */

class Demo{
	int num =10;
	final int num2=20;
	public Demo(){
		num =100;
		//�޷�Ϊ���ձ���num2����ֵ
//		num2 = 200;
	}
}

public class FinalTest2 {
	public static void main(String[] args){
		Demo d = new Demo();
		//num = 100
		System.out.println(d.num);
	}
}
