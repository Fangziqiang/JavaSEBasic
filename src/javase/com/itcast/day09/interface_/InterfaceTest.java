/*
 * è���������������ߵĶ��⹦��
 * �������Ӿ��嵽����
 * 		è��
 * 			����������
 * 			�Է���˯��
 * 		����
 * 			����������
 * 			�Է���˯��
 * 
 * 		�����й��Թ��ܣ����ԣ����ǳ�ȡ��һ�����ࣺ
 * 		���
 * 			����������
 * 			�Է�()��
 * 			˯��(){}
 * 
 * 		è���̳��Զ���
 * 		�����̳��Զ���
 * 
 * 		���ߵĶ��⹦����һ���µ���չ���ܣ���������Ҫ����һ���ӿ�
 * 		�ӿڣ�
 * 			����
 * 		����è��ʵ������
 * 		���ֹ���ʵ������
 * 
 * ʵ�֣�
 * 		�Ӿ��嵽����
 */

//�������߽ӿ�
package com.itcast.day09.interface_;
interface Jumpping{
	//���߹���
	public abstract void jump();
}

//���������
abstract class AnimalTest{
	private String name;
	private int age;
	public AnimalTest(){}
	public AnimalTest(String name,int age){
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

//����è��
class CatTest extends AnimalTest{
	public CatTest(){}
	public CatTest(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("è����");
	}
}
//���幷��
class DogTest extends AnimalTest{
	public DogTest(){}
	public DogTest(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("������");
	}
}

//�����߹��ܵ�è
class JumpCat extends CatTest implements Jumpping{
	public JumpCat(){}
	public JumpCat(String name,int age){
		super(name,age);
	}
	public void jump(){
		System.out.println("����è");
	}
}

//�����߹��ܵĹ�
class JumpDog extends DogTest implements Jumpping{
	public JumpDog(){}
	public JumpDog(String name,int age){
		super(name,age);
	}
	public void jump(){
		System.out.println("���߹�");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������è
		JumpCat jc = new JumpCat();
		jc.setName("����A��");
		jc.setAge(3);
		System.out.println(jc.getName()+"---"+jc.getAge());
		jc.eat();
		jc.sleep();
		jc.jump();
		System.out.println("-------------------");
		
		JumpCat jc2 = new JumpCat("�ӷ�è",2);
		System.out.println(jc2.getName()+"---"+jc2.getAge());
		jc2.eat();
		jc2.sleep();
		jc2.jump();
		System.out.println("-------------------");
		//�������߹�
	}

}
