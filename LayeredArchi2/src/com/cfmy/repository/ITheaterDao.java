package com.cfmy.repository;

import java.util.HashMap;
import java.util.List;

import com.cfmy.model.Theater;

public interface ITheaterDao {
	public abstract int addTheater(Theater theater);
	public abstract int deleteTheater(int tid);
	public abstract int updateTheater(int tid);
	public abstract Theater getByName(String name);
	public abstract Theater getByName(int id);
	public abstract HashMap<Integer,Theater> getAll();
}