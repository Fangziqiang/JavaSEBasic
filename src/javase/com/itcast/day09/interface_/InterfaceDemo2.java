package com.itcast.day09.interface_;

/*
 * �ӿڳ�Ա�ص㣺
 * 		��Ա������ֻ���ǳ����������Ǿ�̬�ģ�Ĭ�����η���public static final
 * 		���췽�����ӿ�û�й��췽��
 *		��Ա������	
 * 		
 * ���е��඼Ĭ�ϼ̳�
 * �ɴ˿ɼ���
 * 	A���������̬������û�У�
 *  B���������̬�����ã�
 *  C���ӿڶ�̬����ã�
 */

interface Inter{
	public int num = 10;
	public final int num2 = 20;
	public static final int num3 = 30;
	
	//������Ҫ<��ʶ��>�����Խӿ�û�й��췽��
//	public Inter(){}
	
	//�ӿڷ������ܴ�������
	public void show(){}
}

//�ӿ���+Impl���ָ�ʽ�ǽӿڵ�ʵ�����ʽ
class InterImpl implements Inter{
	
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
