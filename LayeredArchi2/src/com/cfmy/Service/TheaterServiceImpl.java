package com.cfmy.Service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import com.cfmy.model.Theater;
import com.cfmy.repository.ITheaterDao;
import com.cfmy.repository.TheaterDaoImpl;

public class TheaterServiceImpl  implements ITheaterService{
	Scanner scn=new Scanner(System.in);
	 static List<Theater> dao=new ArrayList<Theater>();
	@Override
	public int addTheater(Theater theater) {
		ITheaterDao itd= new TheaterDaoImpl();
		theater.setTid(generateId());
		itd.addTheater(theater);
		//dao.addStudent(student);
		ITheaterService it=new TheaterServiceImpl();
		dao.add(theater);
		System.out.println("**************Data Stored***************");
		return 0;
	}
	
//	public void showMe() {
//		System.out.println();
//	}
	private int generateId() {
		//System.out.println((int)(Math.random()*1000));
		return ((int)(Math.random()*10000));
	}
	
	
	@Override
	public int deleteTheater(int tid) {
		if(!dao.isEmpty())
		{
			System.out.println("Enter the Theatre id to remove");
			int num= scn.nextInt();
			for(int i=0;i<dao.size();i++)
			{
				if(dao.get(i).getTid()==num)
				{
				dao.remove(i);
				getAll();
				return tid;
				}
			}
		}
		
		return 0;
	}

	
	@Override
	public void getAll()
	{
		List<Theater> dao1=new ArrayList<Theater>();
		System.out.println("id\t\tname\t\tlocation\tscreen\t\tdate");
		System.out.println("**********************************************************************************");
		ITheaterDao iid=new TheaterDaoImpl();
		ITheaterService it=new TheaterServiceImpl();
		dao1=iid.getAll();
		
	     for(int i=0;i<dao.size();i++) {
	    	 System.out.println(dao.get(i));
	    	 System.out.print(dao.get(i).getTid());
	    	 System.out.printf("\t\t"+dao.get(i).getName());
	    	 System.out.print("\t\t"+dao.get(i).getLocation());
	    	 System.out.print("\t\t"+dao.get(i).getScreens());
	    	 System.out.print("\t\t"+dao.get(i).getMdate());
	     }
	    
	}

	@Override
	public int updateTheater(int tid,int choice) {
		if(choice==1)
		{
			for(int i=0;i<dao.size();i++)
			{
				if(tid==dao.get(i).getTid())
				{
					System.out.println("Enter the Name to update");
					String n1=scn.next();
					dao.get(i).setName(n1);
				}
			}	
		}else if(choice==2) {
			for(int i=0;i<dao.size();i++)
			{
				if(tid==dao.get(i).getTid())
				{
					System.out.println("Enter the No Of Screens to update");
					int n1=scn.nextInt();
					dao.get(i).setScreens(n1);
				}
			}	
		}else if(choice==3) {
			for(int i=0;i<dao.size();i++)
			{
				if(tid==dao.get(i).getTid())
				{
					System.out.println("Enter the Location to update");
					String n1=scn.next();
					dao.get(i).setLocation(n1);
				}
			}	
		}
		else if(choice==4) {
			for(int i=0;i<dao.size();i++)
			{
				if(tid==dao.get(i).getTid())
				{
					System.out.println("Enter the time to update");
					String n1=scn.next();
					LocalDateTime lt=LocalDateTime.parse(n1);
					dao.get(i).setMdate(lt);
				}
			}	
		}
		return tid;
	}

	@Override
	public Theater getByName(String name) {
		int val=0;
		for(int i=0;i<dao.size();i++)
		{
			if(name==dao.get(i).getName())
			{
				val=i;
			break;
			}
		}	
		return dao.get(val);
	}

	@Override
	public Theater getById(int id) {
		// TODO Auto-generated method stub
		int val=0;
		for(int i=0;i<dao.size();i++)
		{
			if(id==dao.get(i).getTid())
			{
				val=i;
			break;
			}
		}	
		return dao.get(val);
	}

	

}
