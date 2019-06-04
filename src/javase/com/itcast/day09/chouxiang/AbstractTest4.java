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
	private String id;
	private int salary;
	public Employee(){};
	public Employee(String name,String id,int salary){
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
	
	public String getId(){
		return id;
	}
	public void setId(String id){
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
	public Programmer(String name,String id,int salary){
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
	public Manager(String name,String id,int salary,int money){
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
		System.out.println(emp.getName()+"---"+emp.getId()+"--"+emp.getSalary());
		emp.work();
		System.out.println("----------------");
		
		/*
		emp =new Manager();
		emp.setName("����");
		emp.setId("czbk002");
		emp.setSalary(8000);
		emp.setMoney(2000)
		System.out.println(emp.getName()+"---"+emp.getId()+"--"+emp.getSalary());
		emp.work();
		System.out.println("----------------");
		*/
		//��������������е����ݣ���������������������
		Manager m =new Manager();
		m.setName("����");
		m.setId("czbk002");
		m.setSalary(8000);
		m.setMoney(2000);
		System.out.println(m.getName()+"---"+m.getId()+"--"+m.getSalary());
		m.work();
		
		//ͨ�����췽����ֵ
		m = new Manager("����2","czbk002_2",8000,2000);
		System.out.println(m.getName()+"---"+m.getId()+"--"+m.getSalary());
		m.work();
		
	}
}
