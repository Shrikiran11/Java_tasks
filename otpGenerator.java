package com.cf.java;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

interface Generator{
	public abstract String generateOtp();
}
public class otpGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new LinkedHashSet();
Generator generator=()->{
	int d=(int)(Math.random()*1000000) ;
	//System.out.println(d);
	String s=String.valueOf(d);
	//System.out.println(s);
	return s;
};
String otp=generator.generateOtp();
boolean check;
Predicate<String> p=(o)->otp.length()==6;
check=p.test(otp);
//System.out.println(p.test(otp));

//if(otp.length()==6)
//	check=true;
//else
//	check=false;
if(check==true)
set.add(otp);
for(String str:set) {
	System.out.println("otp generated  "+str);
}

}
}
