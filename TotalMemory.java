package com.cf.javaTasks;
import java.io.IOException;
import java.util.*;
public class TotalMemory {
		public static void main(String[] args) throws IOException {
			//On UNIX systems, it returns "\n"; on MicrosoftWindows systems it returns "\r\n".
			Runtime r=null;//new Runtime();
			r=Runtime.getRuntime();
			final int byteVal=1024;
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter how you want the memory");
			String input=scn.next();
			long memory=r.totalMemory();
			System.out.println(memory);
			switch(input) {
			case "kb":
				double result=memory/byteVal;
				System.out.println("memory in kb: "+result+" kb");
				break;
			case "mb":
				double result1=memory/byteVal*byteVal;
				System.out.println("memory in mb: "+result1+" mb");
				break;
			case "gb":
				double result2=memory/byteVal*byteVal*byteVal;
				System.out.println("memory in gb: "+result2+" gb");
				break;
			}
		}

	}