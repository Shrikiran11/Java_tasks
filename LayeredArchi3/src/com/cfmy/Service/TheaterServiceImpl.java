package com.cfmy.Service;

import java.util.HashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cfmy.model.Theater;
import com.cfmy.repository.ITheaterDao;
import com.cfmy.repository.TheaterDaoImpl;

public class TheaterServiceImpl  implements ITheaterService{
	
	@Override
	public int addTheater(Theater theater) throws IOException {
		// System.out.println(theater);
		ITheaterDao dao=new TheaterDaoImpl();
		
		
		theater.setTid(generateId());
		
		dao.addTheater(theater);
	
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
		
		return null;
	}

	

}
