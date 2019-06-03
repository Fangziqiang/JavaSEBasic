package com.itcast.day09.chouxiang;

/*
 * ���������ڿ���һ��ϵͳʱ��Ҫ��Ա���������ƣ�Ա������3�����ԣ������������Լ�����
 * ����Ҳ��Ա�������˺���Ա���������⣬���⻹��һ���������ԡ�
 * ��ʹ�ü̳е�˼����Ƴ�Ա����;����࣬Ҫ�������ṩ��Ҫ�ķ����������Է��ʡ�
 * 
 * ������
 * 		Ա���ࣺ
 * 			��Ա���������������ż�����
 * 			��Ա����������
 * 		�����ࣺ
 * 			��Ա���������������ż����ʣ��������� 
 * 			��Ա����������
 */			
abstract class Employee{
	private String name;
	private int id;
	private int salary;
	public Employee(){};
	public Employee(String name,int id,int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	
	public int getSalary(){
		return salary;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}
	
	//����
	public abstract void work();
}

//��ͨԱ����
class  Programmer extends Employee{
	public Programmer(){}
	public Programmer(String name,int id,int salary){
		super(name,id,salary);
	}
	
	public void work(){
		System.out.println("��������д����");
	}
}

//������
class  Manager extends Employee{
	//����
	private int money;//bonus:����
	public Manager(){}
	public Manager(String name,int id,int salary,int money){
		super(name,id,salary);
		this.money=money;
	}
	
	public void work(){
		System.out.println("���ͻ�̸����");
	}
	
	public int getMoney(){
		return money;
	}
	public void setMoney(int money){
		this.money=money;
	}
}
public class AbstractTest4 {
	public static void main(String[] args){
		//������ͨԱ��
		Employee emp =new Programmer();
		emp.setName("����ϼ");
		emp.setId("czbk001");
		emp.setSalary(18000);
		System.out.println(emp.getName()+"---"+emp.getId()+"--"+emp.getSalary);
		emp.work();
		//��ҵ�����
		
	}
}
