package com.cf.javaTasks;


//Java program to create Stream from Collections

import java.util.*;
import java.util.stream.Stream;

class StreamList {

 // Function convert a List into Stream
 private static <String> void getStream(List<String> list)
 {

     // Create stream object with the List
     Stream<String> stream = list.stream();

     // Iterate list first to last element
     Iterator<String> it = stream.iterator();

     // Iterate stream object
     while (it.hasNext()) {
         System.out.print(it.next() + " ");
     }
 }

 public static void main(String[] args)
 {

     // Create ArrayList of String
     List<String> list = new ArrayList<>();

     // Add element in list
     list.add("hello");
     list.add("world");
     list.add("my");
     list.add("java");
     list.add("Stream");
     // Get the Stream from the List
     getStream(list);
 }
}