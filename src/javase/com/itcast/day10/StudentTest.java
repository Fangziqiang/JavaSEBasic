package com.itcast.day10;

/*
 * ��ʽ������
 * 		�������ͣ�̫�򵥣������ҽ���Ҫ����ģ�
 * 		��������
 * 			�ࣺ�����������ʱ����ʵ�����Ѿ������ˣ���Ҫ���Ǹ���Ķ���
 * 			������
 * 			�ӿ�
 */		

class Student{
	public void study(){
		System.out.println("Good Good Study,Day Day up");
	}
}

class StudentDemo{
	public void method(Student s){
		s.study();
	}
}
public class StudentTest {
	public static void main(String[] args){
		//������Ҫ����ѧ�����study()����
		Student s = new Student();
		s.study();
		System.out.println("------------------");
		
		//����2����Ҫ����studentDemo���е�method()����
		StudentDemo sd =new StudentDemo();
		Student ss = new Student();
		sd.method(ss);
		System.out.println("------------------");
		
		//���������÷�
		new StudentDemo().method(new Student());
	}

}
