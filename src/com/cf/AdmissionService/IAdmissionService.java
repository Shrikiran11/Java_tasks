package com.cf.AdmissionService;

public interface IAdmissionService {
public abstract void login(String userName,String password);
public abstract void signUp(String userName,String password,String phno);
public abstract int score(int boards,int math,int phy,int chem);
public abstract double scoreLateral(double perc);
}
