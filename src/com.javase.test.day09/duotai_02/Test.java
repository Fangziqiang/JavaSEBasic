package duotai_02;

public  class Test {

	public static void main(String[] args) {
		System.out.println("--------Cat-----------");
		show(new Cat());
		System.out.println("--------Dog-----------");
		show(new Dog());
		
		System.out.println("--------Cat��eat-----------");
		Animal a =new Cat();
		a.eat();
		System.out.println("--------Cat��work-----------");
		Cat c = (Cat)a;
		c.work();
	}
	public static void show(Animal a) {
		a.eat();
		if (a instanceof Cat) {
			Cat c = (Cat)a;
			c.work();
		}else if(a instanceof Dog) {
			Dog c=(Dog)a;
			c.work();
		}
	}
}

abstract class Animal{
	abstract void eat();
}

class Cat extends Animal{
	public void eat() {
		System.out.println("����");
	}
	public void work() {
		System.out.println("ץ����");
	}
}

class Dog extends Animal {  
    public void eat() {  
        System.out.println("�Թ�ͷ");  
    }  
    public void work() {  
        System.out.println("����");  
    }  
}
