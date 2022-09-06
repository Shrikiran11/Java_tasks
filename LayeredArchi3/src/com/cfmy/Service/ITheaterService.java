package com.cfmy.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.cfmy.model.Theater;

public interface ITheaterService {
	public abstract int addTheater(Theater theater)throws IOException;
	public abstract int deleteTheater(int tid);
	public abstract int updateTheater(int tid);
	public abstract Theater getByName(String name);
	public abstract Theater getById(int id);
	public abstract HashMap<Integer,Theater> getAll();
}