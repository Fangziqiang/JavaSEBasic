package duotai_02;

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
 */		
 class Fu{
	 public void show(){
		 System.out.println("show Fu");
	 }
 }
 
 class Zi extends Fu{
	 public void show(){
		 System.out.println("show Zi");
	 }
 }
 
 class Zi2 extends Fu{
	 public void show() {
		 System.out.println("show Zi2");
	 }
 }
 
public class DuoTaiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fu f =new Fu();
		f.show();
		Fu f1 =new Zi();
		f1.show();
		
		Fu f2 = new Zi2();
		f2.show();
	}

}
