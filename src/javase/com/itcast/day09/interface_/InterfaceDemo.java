package com.itcast.day09.interface_;

/*
 * �ӿڵ��ص㣺
 * 		A���ӿ��ùؼ���interface��ʾ
 * 			interface �ӿ���{}
 * 		B����ʵ�ֽӿ���implements��ʾ
 * 			class ���� implements �ӿ��� {}
 * 		C���ӿڲ���ʵ����
 * 			��ô���ӿ����ʵ�����أ�
 * 			���ն�̬�ķ�ʽ��ʵ������
 * 
 * �ɴ˿ɼ���
 * 	A���������̬������û�У�
 *  B���������̬�����ã�
 *  C���ӿڶ�̬����ã�
 */
//���嶯����ѵ�ӿ�
interface AnimalTrain{
	public abstract void jump();
}



class InterfaceDemo {
	public static void main(String[] args){
		AnimalTrain at = new AnimalTrain();
		at.jump();
	}
}
