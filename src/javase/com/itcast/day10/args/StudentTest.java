package com.itcast.day10.args;
import com.itcast.day10.*;
/*
 * 形式参数：
 * 		基本类型（太简单，不是我今天要讲解的）
 * 		引用类型
 * 			类做形参 ：（匿名对象的时候其实我们已经讲过了）需要的是该类的对象
 * 			抽象类
 * 			接口
 */		


class StudentDemo{
	public void method(Student s){
		s.study();
	}
}
public class StudentTest {
	public static void main(String[] args){
		//需求：我要测试学生类的study()方法
		Student s = new Student();
		s.study();
		System.out.println("------------------");
		
		//需求2：我要测试studentDemo类中的method()方法
		StudentDemo sd =new StudentDemo();
		Student ss = new Student();
		sd.method(ss);
		System.out.println("------------------");
		
		//匿名对象用法
		new StudentDemo().method(new Student());
	}

}
