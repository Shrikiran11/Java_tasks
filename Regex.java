package com.cf.javaTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
public static void main(String[] args) {
	String str="longlong ago so long ago there was aminion";
	String regex=".*?(long)";
	Pattern pattern=Pattern.compile(regex);
	Matcher match=pattern.matcher(str);
	while(match.find()) {
		System.out.println(match.group());
	}
}
}
