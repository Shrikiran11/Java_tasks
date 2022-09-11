package com.cf.AdmissionService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cf.AdmissionDao.AdmissionDaoImpl;
import com.cf.AdmissionDao.IAdmissionDao;
public class AdmissionServiceImpl implements IAdmissionService {
	  public static boolean isValidUsername(String name)
	    {
	        String regex = "^[A-Za-z]\\w{5,29}$";
	        Pattern p = Pattern.compile(regex);
	        Matcher m = p.matcher(name);
	        if (name == null) {
	            return false;
	        }
	        return m.matches();
	    }
	     public static boolean isValidPhno(String phno){

	         String regex = "^\\d{10}$";
	            Pattern pattern = Pattern.compile(regex);
	            Matcher matcher = pattern.matcher("9876543210");
	            
	        if (phno == null) {
	            return false;
	        }
	        return matcher.matches();
	     }
	   
	   
	     public static boolean isValidPassword(String password)
	    {
	    	 boolean isPwd=false;
	    
	       String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
	        Pattern p = Pattern.compile(regex);
	        if (password == null) {
	            return false;
	        }
	        Matcher m = p.matcher(password);
	       isPwd= m.matches();
	       return isPwd;
	    }

	 public void login(String userName,String password){
		    IAdmissionDao asd= new AdmissionDaoImpl();
		      boolean checkUsn,checkPwd,checkPhno;
		       checkUsn=AdmissionServiceImpl.isValidUsername(userName);
		       checkPwd=AdmissionServiceImpl.isValidPassword(password);
		       checkPhno=AdmissionServiceImpl.isValidPhno(password);
		       if(checkUsn==true&&checkPwd==true&&checkPhno){
		            asd.login(userName,password);
		       }
		        public void signUp(String userName,String password,String phno){
		    IAdmissionDao asd=new AdmissionDaoImpl();
		      boolean check,check1;
		       check=AdmissionServiceImpl.isValidUsername(userName);
		       check1=AdmissionServiceImpl.isValidPassword(password);
		      
		       if(check==true&&check1==true){
		            asd.signUp(userName,password,phno);
		       }
		   }
		
		    public int score(int boards,int math,int phy,int chem){
		        int cutOff=0;
		        switch(boards){
		            case 1:
		          cutOff = math / 2 + chem / 4 + phy / 4;
		          cutOff=cutOff/2;
		         break;
		         case 2:
		             cutOff= math + chem / 2 + phy / 2;
		        }
		        return cutOff;
		    }
		        public double scoreLateral(double perc){
		        return perc;
		        }
		        
}
