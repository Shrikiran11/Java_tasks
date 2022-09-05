package com.cf.javaTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNoValidation {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String phno=scn.next();
	String pattern="^[9876]\\d{9}$";
	Pattern p=Pattern.compile(pattern);
	Matcher m=p.matcher(phno);
	System.out.println(m.matches());
	
}
}
