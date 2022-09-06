package com.cfmy.Service;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import com.cfmy.model.Theater;
import com.cfmy.repository.ITheaterDao;
import com.cfmy.repository.TheaterDaoImpl;

public class TheaterServiceImpl  implements ITheaterService{
	static List<Theater> dao=new ArrayList<Theater>();
	@Override
	public int addTheater(Theater theater) {
		// System.out.println(theater);
		//ITheaterDao dao=new TheaterDaoImpl();
		
		
		theater.setTid(generateId());
		
		dao.add(theater);
	
		//System.out.println(dao);
		
		
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
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public int updateTheater(int tid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Theater getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Theater getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<Integer, Theater> getAll()
	{
		System.out.println("id\t\tname\t\tlocation\tscreen\t\tdate");
		System.out.println("**********************************************************************************");
		for(int i=0;i<dao.size();i++)
		{	
			System.out.println(dao.get(i));
		}
		return null;
	}

	

}
