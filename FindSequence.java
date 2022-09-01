package com.cf.javaTasks;
import java.util.*;
import java.util.regex.*;
import java.util.regex.Pattern;
public class FindSequence {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter your choice");
	System.out.println("choice 1 Check wether the element is found in string");
	System.out.println("choice 2 return index of first found element");
	System.out.println("choice 3 return index of last found element");
	System.out.println("choice 4 group count");
	System.out.println("choice 5 given string matches the string");
	int choice=scn.nextInt();
	
	System.out.println("input string");
	String find=scn.next();
	System.out.println("main string");
	String Original=scn.next();
	Pattern pattern=Pattern.compile(find);
	Matcher match=pattern.matcher(Original);
	switch(choice) {
	case 1:
	if(match.find()==true) {
		System.out.println("Entered item found");
	}else {
		System.out.println("not found");
	}
	//helloworldhello
	//he**o
	break;
	case 2:
		while (match.find()) {
            System.out.println(match.start());
        }
	break;
	case 3:
		while (match.find()) {
            System.out.println(match.end());
        }
	break;
	case 4:
		System.out.println(match.groupCount());
	break;
	case 5:
		System.out.println(match.matches());
	break;
}
}
}