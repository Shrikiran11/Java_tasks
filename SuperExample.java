package com.cf.javaTasks;

class Professor{
	String qualifcation="Mtech Ph.d";
	int id;
	Professor(int value){
		id=value;
		System.out.println(" Professor "+id);
	}
	public Professor() {
		// TODO Auto-generated constructor stub
	}
}
class Hod extends Professor{
	int experience=22;
	String specialization;
	Hod(){
		
	}
	Hod(String spl,int val){
		super( val);
		specialization=spl;
		System.out.println(" Hod "+specialization+" id "+val);
	}
}
public class SuperExample {
	public static void main(String[] args) {
		Professor professor=new Professor(12);
		Hod hod=new Hod("ECE",88);
		
	}
}