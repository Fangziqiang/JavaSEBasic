package final_01;
/*
 * �����⣺final���ξֲ���������
 * 		�������ͣ��������͵�ֵ���ܷ����ı�
 * 		�������ͣ��������͵ĵ�ֵַ���ܷ����ı䣬���ǣ��ö���Ķ��ڴ��ֵ�ǿ��Ըı�ġ�
 */
class Student{
	int age = 10;
}
public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ֲ������ǻ�����������
				int x = 10;
				x = 100;
				System.out.println(x);
				final int y = 10;
				//�޷�Ϊ���ձ���y����ֵ
				//y = 100;
				System.out.println(y);
				System.out.println("--------------");
				
				//�ֲ�������������������
				Student s = new Student();
				System.out.println(s.age);
				s.age = 100;
				System.out.println(s.age);
				System.out.println("--------------");
				
				final Student ss = new Student();
				System.out.println(ss.age);
				ss.age = 100;
				System.out.println(ss.age);
				
				//ss=new Student();
	}

}