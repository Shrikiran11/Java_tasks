package com.cf.java;
import java.util.*;
class Zoo extends Exception{
	Zoo(String alert){
		super(alert);
	}
}
class Animal<T>{
	
}
class Elephant extends Animal{
	
}
class Cat extends Animal{
	
}
class Dog extends Animal{
	
}
class Monkey{
	
}
public class WildCardAnimal {
public static void main(String[] args)throws Zoo {
	List<? super Animal> list=new ArrayList();
	Elephant ele=new Elephant();
	Cat cat=new Cat();
	Dog dog=new Dog();
	Monkey m=new Monkey();
	list.add(ele);
    list.add(cat);
    list.add(dog);
}
}
