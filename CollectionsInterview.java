package com.cf.task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
class Bca{
	String name1="Raju";
	String name2="suresh";
	String name3="manoj";
}
class Mca{
	String name1="mukesh";
	String name2="ravi";
	String name3="partha";
}
class Btech{
	String name1="gajini";
	String name2="rao";
	String name3="vasu";
}
class Mtech{
	String name1="nadir";
	String name2="manish";
	String name3="vinsmoke";
}
class Test{
	public boolean takeTest(int mark,String s) {
		boolean b;
		if(mark>50)
		b=true;
		else
		b=false;
		return b;
	}
}
public class CollectionsInterview{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String candidate=scn.next();
		ArrayList<String> arrList=new ArrayList();
		switch(candidate) {
		case "ug":
			Bca interview=new Bca();
			arrList.add(interview.name1);
			arrList.add(interview.name2);
			arrList.add(interview.name3);
			Btech interview1=new Btech();
			arrList.add(interview1.name1);
			arrList.add(interview1.name2);
			arrList.add(interview1.name3);
			break;
		case "pg":
			Mca interview3=new Mca();
			arrList.add(interview3.name1);
			arrList.add(interview3.name2);
			arrList.add(interview3.name3);
			Mtech interview4=new Mtech();
			arrList.add(interview4.name1);
			arrList.add(interview4.name2);
			arrList.add(interview4.name3);
			break;
		case "engineering":
			Btech interview5=new Btech();
			arrList.add(interview5.name1);
			arrList.add(interview5.name2);
			arrList.add(interview5.name3);
			Mtech interview6=new Mtech();
			arrList.add(interview6.name1);
			arrList.add(interview6.name2);
			arrList.add(interview6.name3);
			default:
				System.out.println("missmatch");	
		}
		System.out.println("Qualified list");
		System.out.println(arrList);
		HashMap<String,Integer> hm=new HashMap<>();
		Test t=new Test();
		for(String s:arrList) {
			
			boolean check=false;
			int count=0;
			System.out.println("Enter mark of "+s);
			int mark=scn.nextInt();
			check=t.takeTest(mark, s);
			
			if(check==true) {
				System.out.println(s+"passed and succesfully added to company");
				count++;
			hm.put(s,count);
			}else {
				while(check==false&&count<5) {
					System.out.println("re");
				mark=mark+10;
				if(mark>50)
					check=true;
				count++;
				}
				hm.put(s,count);
			}
			
		}
		System.out.println(hm);
	}

}