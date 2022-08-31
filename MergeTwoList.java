import java.util.*;

import java.util.stream.*;

class MergeTwoList{
 
   public static void main(String[] args){

        	List arrList=new ArrayList();
    
        		arrList.add("fire");
    
        		arrList.add("Water");
    
        		arrList.add("sand");
        
       		 arrList.add("sky");
         
	List arrList2=new ArrayList();
     
	  	arrList.add("nerupu");
   
		 arrList.add("thani");
  
	     	arrList.add("manu");
    
	    	arrList.add("agayam");
    
	 List arrList3=new ArrayList();
     
	   	arrList.addAll(arrList2);
       
		 arrList3.addAll(arrList);
       
		 System.out.println(arrList3);
  
  	}

}