package com.itcast.day09.interface_;

/*
 * �ӿڳ�Ա�ص㣺
 * 		��Ա������ֻ���ǳ����������Ǿ�̬�ģ�
 * 				Ĭ�����η���public static final
 *				 �����ֶ������������η�
 * 		���췽�����ӿ�û�й��췽��
 *		��Ա������ֻ���ǳ��󷽷���
 *				Ĭ�����η���public abstact
 *				���飺�Լ��ֶ�����
 * 		
 * ���е��඼Ĭ�ϼ̳���һ���ࣺobject.
 * ��Object�����νṹ�ĸ��࣬ÿ���඼ʹ��object��Ϊ���ࡣ
 * �ɴ˿ɼ���
 * 	A���������̬������û�У�
 *  B���������̬�����ã�
 *  C���ӿڶ�̬����ã�
 */

interface Inter{
//	�ӿ��еı���Ĭ��Ϊ����
	public int num = 10;
	public final int num2 = 20;
	public static final int num3 = 30;
	
	//���췽����������Ҫ<��ʶ��>�����Խӿ�û�й��췽��
//	public Inter(){}
	
	//��Ա�������ӿڷ������ܴ�������{}�������ǳ����
	//public void show(){}
	
//	abstract void show();//Ĭ��public
	public abstract void show();//Ĭ��abstrac
}

//�ӿ���+Impl���ָ�ʽ�ǽӿڵ�ʵ�����ʽ
/*
 class InterImpl implements Inter{
	public InterImpl(){
		super();
	}
} 
 */

class InterImpl extends Object implements Inter{
	public InterImpl(){
		super();
	}
	
	public void show(){}
}

//������
class InterfaceDemo2 {
	public static void main(String[] args){
		//��������
		Inter i = new InterImpl();
		System.out.println(i.num);
		System.out.println(i.num2);
//		i.num = 100;
//		i.num2 = 200;
//		System.out.println(i.num);//�޷�Ϊ���ձ���num����ֵ
//		System.out.println(i.num2);//�޷�Ϊ���ձ���num2����ֵ
		
	}
}
