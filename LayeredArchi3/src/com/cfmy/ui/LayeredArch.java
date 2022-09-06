package com.cfmy.ui;



import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.cfmy.model.Theater;
import com.cfmy.repository.ITheaterDao;
import com.cfmy.repository.TheaterDaoImpl;
import com.cfmy.Service.ITheaterService;
import com.cfmy.Service.TheaterServiceImpl;

public class LayeredArch {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		//UI
		System.out.println("****Theater Management System****");
		//printf(%3s
		while(true) {
		
		System.out.println(" 1. Add Theater \n 2. get all theater list\n 3. exit");
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
		case 2:
			ITheaterDao it=new TheaterDaoImpl();
			it.getAll();
			break;
			default:
				System.exit(10);
		}	
	}
	}
}