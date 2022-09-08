package com.cfmy.ui;
//2022-09-09T09:09:09


import java.time.LocalDateTime;
import java.util.Scanner;

import com.cfmy.model.Theater;
import com.cfmy.Service.ITheaterService;
import com.cfmy.Service.TheaterServiceImpl;

public class LayeredArch {

	public static void main(String[] args) {
		//UI
		System.out.println("****Theater Management System****");
		//printf(%3s
		while(true) {
		
		System.out.println(" 1. Add Theater \n 2. delete Theater\n 3. update Theater"
				+ "\n 4. get Theater by name \n 5. getTheater by id \n 6. get all theater list\n 7. exit");
		Scanner scan=new Scanner(System.in);
		System.err.println("Enter ur choice!!!");
		int option =scan.nextInt();
		ITheaterService iserv=new TheaterServiceImpl();
		ITheaterService its=new TheaterServiceImpl();
		switch(option) {
		case 1:
			System.out.println("enter name of the theater");
			String name=scan.next();
			System.out.println("enter no of screens");
			int screens=scan.nextInt();
			System.out.println("enter ,location");
			String loc=scan.next();
			System.out.println("enter show date&time");
			String tdate=scan.next();
			LocalDateTime ldt=LocalDateTime.parse(tdate);
			Theater theater=new Theater(name,loc,screens,ldt);
			its.addTheater(theater);
				break;
		case 2:
			int val=scan.nextInt();
			its.deleteTheater(val);
			break;
		case 3: 
			System.out.println("what do want to update 1:name 2:no of screens 3:location 4:date");
			System.out.println("Enter the choice 1 or 2");
			int number =scan.nextInt();
			System.out.println("Enter tid to update");
			int tid=scan.nextInt();
			its.updateTheater(tid,number);
			break;
		case 4:
			System.out.println("Enter name to search");
			String nam=scan.next();
			System.out.println(its.getByName(nam));
			break;
		case 5:
			System.out.println("Enter id to search");
			int idi=scan.nextInt();
			System.out.println(its.getById(idi));
			break;
		case 6:
			its.getAll();
			break;
			default:
				System.exit(10);
		}	
	}
	}
}