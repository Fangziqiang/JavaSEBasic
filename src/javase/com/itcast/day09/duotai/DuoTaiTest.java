package com.itcast.day09.duotai;

class Animal2{
	public void eat(){
		System.out.println("≥‘∑π");
	}
}

class Dog2 extends Animal2{
	public void eat(){
		System.out.println("π∑≥‘»‚");
	}
	
	public void lookDoor(){
		System.out.println("π∑ø¥√≈");
	}
}

class Cat2 extends Animal2{
	public void eat(){
		System.out.println("√®≥‘”„");
	}
	
	public void playGame(){
		System.out.println("√®◊Ω√‘≤ÿ");
	}
}
public class DuoTaiTest {
	public static void main(String[] args){
		Animal2 a =new Dog();
		a.eat();
		System.out.println("--------------------------------------------------");
		
		//ªπ‘≠≥…π∑
		Dog d = (Dog)a;
		d.eat();
		d.look
		
	}
}
