
import java.util.*;

 
class Animal<T>{
  
	  T g;
   
	 Animal(T g){

	        if((g instanceof Tiger)||(g instanceof Monkey)||(g instanceof Orang)){
 
           		System.out.println("Added sucessfully\n");
	
        } else{
	
            System.out.println("Not a type of Monkey/Tiger/Orangutan\n");

	        }
    
	}
	
}

class Tiger{


    
}

class Monkey{


    
}

class Orang{
 

   
}


class Inter{
   
 public static void main(String[] args){
 
       Tiger t=new Tiger();
       
 Monkey m=new Monkey();
    
    Orang o=new Orang();
      
  Cat c=new Cat();

 Animal<Tiger> an1=new Animal<Tiger>(t);

 Animal<Monkey> an2=new Animal<Monkey>(m);

Animal<Orang> an3=new Animal<Orang>(o);

Animal<Cat> an4=new Animal<Cat>(c);
       
 }
   
 }