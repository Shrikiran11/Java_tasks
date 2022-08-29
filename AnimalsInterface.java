package com.cf.OOps;
class Animal{
	public  void makeSound() {
		System.out.println("Make Sound\n");
	}
	public  void eatingHabit() {
		System.out.println("eat to survive\n");
	}
}
class Elephant extends Animal{
	@Override
	public void makeSound() {
		System.out.println("trumphet\n");
	}
	@Override
	public  void eatingHabit() {
		System.out.println("eats grass,leaves and fruits\n");
	}
}
class Cheetah extends Animal{
	public void specialFeature(){
		System.out.println("run at top speed\n");
	}
	@Override
	public void makeSound() {
		System.out.println("churtling\n");
	}
	@Override
	public  void eatingHabit() {
		System.out.println("deer and other medium sized harbivores\n");
	}
}
class Snake extends Animal{
	public void specialFeature(){
		System.out.println("Venom to kill\n");
	}
	@Override
	public void makeSound() {
		System.out.println("hiss\n");
	}
	@Override
	public  void eatingHabit() {
		System.out.println("rats and small sized animals\n");
	}
}
public class AnimalsInterface {
	public static void main(String[] args) {
		Animal animal=new Animal();
		Animal ele=new Elephant();
		ele.makeSound();
		ele.eatingHabit();
		Animal ch=new Cheetah();
		ch.makeSound();
		ch.eatingHabit();
		Animal sn=new Snake();
		sn.makeSound();
		sn.eatingHabit();
	}

}