package com.cfmy.ui;



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
		
			iserv.addTheater(theater);
				break;
		case 2:
			
			break;
		case 3: break;
			
		case 6:
			iserv.getAll();
			break;
			default:
				System.exit(10);
		}	
	}
	}
}