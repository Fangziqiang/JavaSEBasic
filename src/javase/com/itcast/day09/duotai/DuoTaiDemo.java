package com.itcast.day09.duotai;

/*
 * ��̬��ǰ�᣺
 * 		A:Ҫ�м̳й�ϵ
 * 		B:Ҫ�з�����д
 * 			��ʵû��Ҳ�ǿ��Եģ��������û�������û������
 * 				���� d = new è();
 * 				d.show();
 * 				���� d = new ��();
 * 				d.show();
 * 		C:Ҫ�и�������ָ���������
 * 			�� f = new ��();
 * 
 * 		��̬�еĳ�Ա�����ص㣺
 * 		A����Ա����
 * 			���뿴��ߣ����п����
 * 		B�����췽��
 * 			������������ʱ�򣬷��ʸ���Ĺ��췽�����Ը�������ݽ��г�ʼ��
 * 		C����Ա����
 * 			���뿴��ߣ����п��ұ�
 * 		D����̬��������̬������أ����з��ʵĻ�����ߣ�
 * 			���뿴��ߣ����п����			
 */		
 class Fu{
	 public int num = 100;
	 public void show(){
		 System.out.println("��Ա������show Fu");
	 }
	 
	 public static void funcation(){
		 System.out.println("��̬������funcation FU");
	 }
 }
 
 class Zi extends Fu{
	 public int num = 1000;
	 public int num2 = 200;
	 
	 @Override
	public void show(){
		 System.out.println("��Ա������show Zi");
	 }
	 
	 public static void funcation(){
		 System.out.println("��̬������funcation Zi");
	 }
	 
	 public void method(){
		 System.out.println("method zi");
	 }
 }
 

public class DuoTaiDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fu f =new Fu();
//		f.show();
		Fu f1 =new Zi();
		//��Ա���������뿴��ߣ����п��ұ�
		f1.show();
		//�Ҳ�������
		//f1.method();
		
		//��̬���������뿴��ߣ����п����
		Fu.funcation();
		
		//��Ա���������뿴��ߣ����п���ߣ����Դ�ӡ��numֵΪ100
		System.out.println("��Ա������"+f1.num);
		//�Ҳ�������
		//System.out.println(f1.num2);
		Zi z = (Zi)f1;
		z.method();
	}

}
