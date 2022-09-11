package com.cf.AdmissionDao;

public interface IAdmissionDao {
	public abstract void login(String userName,String password);
	public abstract void signIn(String userName,String password,String phno);
}
