package com.cfmy.Service;

import java.util.HashMap;
import java.util.List;

import com.cfmy.model.Theater;

public interface ITheaterService {
	public abstract int addTheater(Theater theater);
	public abstract int deleteTheater(int tid);
	public abstract int updateTheater(int tid,int choice);
	public abstract Theater getByName(String name);
	public abstract Theater getById(int id);
	public abstract void getAll();
}