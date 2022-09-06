package com.cf.javaTasks;
class Account{
	private long accNum;
	private double balance;
	private Person accHolder;
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double money) {
		balance=balance+money;
		System.out.println("balance after deposit "+balance);
	}
	public void withDraw(double money) {
		balance=balance-money;
		System.out.println("balance after withdraw "+balance);
	}
	public double getBalance() {
		
		return balance;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + getBalance() + ", accHolder=" + accHolder + "]";
	}
}
class Person{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
public class BankAccount {
public static void main(String[] args) {
	Person smith=new Person("Smith",16);
	Account a1=new Account(9000007368l,2000,smith);
	Person kathy=new Person("Kathy",19);
	Account a2=new Account(9008758585l,3000,smith);
	a1.withDraw(2000);
	a2.withDraw(2000);
	System.out.println(a1);
	System.out.println(a2);
}
}
