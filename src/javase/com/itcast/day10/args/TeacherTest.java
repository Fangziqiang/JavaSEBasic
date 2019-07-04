package com.itcast.day10.args;
/*
 * 形式参数：
 * 		基本类型（太简单，不是我今天要讲解的）
 * 		引用类型
 * 			类做形参 ：（匿名对象的时候其实我们已经讲过了）需要的是该类的对象
 * 			抽象类：需要的是该抽象类的子类对象
 * 			接口:需要的是该接口的实现类对象
 */		

//定义一个爱好的接口
interface Love{
	public abstract void love();
}

class LoveDemo{
	public void method(Love l){
		l.love();
	}
}

//定义具体类实现接口
class Teacher implements Love{
	public void love(){
		System.out.println("老师爱学生，爱java，爱林青霞");
	}
}

public class TeacherTest {
	public static void main(String[] args){
		//需求：我要测试loveDemo类中的love()方法
		LoveDemo ld = new LoveDemo();
		Love l = new Teacher();
		ld.method(l);
	}
}
