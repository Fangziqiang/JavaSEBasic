/*
 * ��ʦ��ѧ��������������̵Ķ��⹦��
 * 
 * ���壺
 * 		��ʦ�����������䣬�Է���˯��
 * 		ѧ�������������䣬�Է���˯��
 * 		
 * 		�����й��Թ��ܣ�������ȡ��һ�����࣬����
 * 
 * 		���ࣺ
 * 			����������
 * 			�Է�();
 * 			˯��();
 * 		
 * 		���̵Ķ��⹦�ܲ����˻�����ʦ������ѧ��һ��ʼ��Ӧ�þ߱������ԣ����ǰ�������Ϊ�ӿ�
 * 		���̽ӿڡ�
 * 
 * 		������ʦ���̣�ʵ�ֳ��̽ӿ�
 * 		����ѧ�����̣�ʵ�ֳ��̽ӿ�
 * 
 * 	ʵ�֣��ӳ��󵽾���
 *  ʹ�ã�����
 */

//������̽ӿ�
package com.itcast.day09.interface_;
interface Smoking{
	//���̵ĳ��󷽷�
	public abstract void smoke();
}

//�����������
abstract class Person{
	private String name;
	private int age;
	public Person(){}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	
	//�Է�
	public abstract void eat();
	//˯��
	public void sleep(){
		System.out.println("˯����");
	}
}

//������ʦ��
class Teacher extends Person{
	public Teacher(){}
	public Teacher(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("�Դ�ײ�");
	}
}
//���幷��
class Student extends Person{
	public Student(){}
	public Student(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("�Ժ�����");
	}
}

//���̵���ʦ
class SmokingTeacher extends Teacher implements Smoking{
	public SmokingTeacher(){}
	public SmokingTeacher(String name,int age){
		super(name,age);
	}
	public void smoke(){
		System.out.println("��ʦ���ۺ���");
	}
}

//�����߹��ܵĹ�
class SmokingStudent extends Student implements Smoking{
	public SmokingStudent(){}
	public SmokingStudent(String name,int age){
		super(name,age);
	}
	public void smoke(){
		System.out.println("ѧ�����л���");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ʦ
		SmokingTeacher st = new SmokingTeacher();
		st.setName("���");
		st.setAge(35);
		System.out.println(st.getName()+"---"+st.getAge());
		st.eat();
		st.sleep();
		st.smoke();
		System.out.println("-------------------");
		
		SmokingTeacher st2 = new SmokingTeacher("�ܽ���",40);
		System.out.println(st2.getName()+"---"+st2.getAge());
		st2.eat();
		st2.sleep();
		st2.smoke();
		System.out.println("-------------------");
		
		//����ѧ��
		SmokingStudent ss = new SmokingStudent();
		ss.setName("��˼Զ");
		ss.setAge(28);
		System.out.println(ss.getName()+"---"+ss.getAge());
		ss.eat();
		ss.sleep();
		ss.smoke();
		System.out.println("-------------------");
		
		SmokingStudent ss2 = new SmokingStudent("��־��",29);
		System.out.println(ss2.getName()+"---"+ss2.getAge());
		ss2.eat();
		ss2.sleep();
		ss2.smoke();
		System.out.println("-------------------");
	}

}
