package com.cfmy.repository;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.cfmy.model.Theater;

public class TheaterDaoImpl  implements ITheaterDao{
	
//2022-09-09T09:09:09
	@Override
	public int addTheater(Theater theater) throws IOException {
		 FileOutputStream fos=new FileOutputStream("customFile.txt");
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		 oos.writeObject(theater);
			fos.close();
			oos.close();
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
		return null;
	}

	@Override
	public HashMap<Integer, Theater> getAll() throws ClassNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("customFile.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Theater t=(Theater)ois.readObject();
		System.out.println(t);
		return null;
	}

}