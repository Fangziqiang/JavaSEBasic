package com.itcast.day10.args;
/*
 * ��ʽ������
 * 		�������ͣ�̫�򵥣������ҽ���Ҫ����ģ�
 * 		��������
 * 			�����β� �������������ʱ����ʵ�����Ѿ������ˣ���Ҫ���Ǹ���Ķ���
 * 			�����ࣺ��Ҫ���Ǹó�������������
 * 			�ӿ�:��Ҫ���Ǹýӿڵ�ʵ�������
 */		

//����һ�����õĽӿ�
interface Love{
	public abstract void love();
}

class LoveDemo{
	public void method(Love l){
		l.love();
	}
}

//���������ʵ�ֽӿ�
class Teacher implements Love{
	public void love(){
		System.out.println("��ʦ��ѧ������java��������ϼ");
	}
}

public class TeacherTest {
	public static void main(String[] args){
		//������Ҫ����loveDemo���е�love()����
		LoveDemo ld = new LoveDemo();
		Love l = new Teacher();
		ld.method(l);
	}
}
