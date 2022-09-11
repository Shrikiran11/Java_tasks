package com.cf.Adui;
import java.util.*;

import com.cf.AdmissionService.AdmissionServiceImpl;
import com.cf.AdmissionService.IAdmissionService;
public class AdmissionUi {
public static void main(String[] args) {
	IAdmissionService ids=new AdmissionServiceImpl();
	Scanner scn=new Scanner(System.in);
	System.out.println("Welcome to admission portal");
	System.out.println("Press 1-to login,press 2-to signup");
	int enter=scn.nextInt();
	switch(enter) {
	case 1:
		System.out.println("Enter your userName");
		String userName=scn.next();
		System.out.println("Enter your password");
		String pwd=scn.next();
		ids.login(userName,pwd);
		System.out.println("request for your operation");
		int choice=scn.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter student details");
			System.out.println("Enter your mode of admission");
			String mode=scn.next();
			switch(mode) {
			case "Direct":
				System.out.println("Enter your boards");
				int boards=scn.nextInt();
				System.out.println("Enter your phy marks");
				int phy=scn.nextInt();
				System.out.println("Enter your chem marks");
				int chem=scn.nextInt();
				System.out.println("Enter your math marks");
				int math=scn.nextInt();
				System.out.println("Enter D-O-B");
				String dob=scn.next();
				ids.score( boards, math,phy, chem);
				System.out.println("Enter your service");
				int service=scn.nextInt();
				switch(service) {
				case 1:
					ids.addStudent(boards,phy,chem,math,dob);
					break;
				case 2:
					ids.showCourse();
					break;
				case 3:
					ids.getFee();break;
				case 4:
					ids.apply();
					break;
				}
				break;
				
			case "Lateral":
				System.out.println("Enter your percentage");
				double perc=scn.nextDouble();
				ids.scoreLateral(perc);
				break;
				
			}
			
		}
		break;
	case 2:
		System.out.println("Enter your userName");
		String usn=scn.next();
		System.out.println("Enter your password");
		String password=scn.next();
		System.out.println("Enter your PhoneNo");
		String phno=scn.next();
		ids.signUp(usn,password,phno);
		
		break;
		
	}
}
}
