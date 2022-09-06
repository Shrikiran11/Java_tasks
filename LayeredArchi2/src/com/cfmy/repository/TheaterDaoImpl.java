package com.cfmy.repository;


import java.util.HashMap;

import com.cfmy.model.Theater;

public class TheaterDaoImpl  implements ITheaterDao{
	

	@Override
	public int addTheater(Theater theater) {
		 HashMap<Integer,Theater> tList=new HashMap();
		//System.out.println("in dao -> "+theater);
		tList.put(theater.getTid(), theater);
		//System.out.println(tList);
		return 0;
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
	public Theater getByName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<Integer, Theater> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}