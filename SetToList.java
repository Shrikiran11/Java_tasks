import java.util.*;

import java.util.stream.*;
 
 
class SetToList {
 
  
  public static void main(String args[])
    {
 
 Set<String> set = new HashSet<String>();
  
     
  // Add elements to set
  
     set.add("black");
   
     set.add("white");
      
  set.add("pink");
     
   set.add("venom");
       
 set.add("itis");
       
 System.out.println("\nSet: " + set+"\n");

List<String> list = new ArrayList<>();

//Method 2

List<String> mylist = new ArrayList<>(set);
     
   for(String t:set){
         
   list.add(t);
       
 }
     
   System.out.println("\nList: " + list+"\n");
   
   System.out.println("\n2ndList: " + mylist);
  
  }
    
   
 
}