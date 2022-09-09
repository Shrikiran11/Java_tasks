package com.cf.javaTasks; 
import java.io.*;  
class ThreadJoin implements Runnable
{   
public synchronized void run()  
{  
for (int j = 0; j < 2; j++)  
{  
try  
{   
Thread.sleep(300);  
System.out.println("The current thread name is: " + Thread.currentThread().getName());  
}  
catch(Exception e)  
{  
System.out.println("The exception has been caught: " + e);  
}  
System.out.println( j );  
}  
}  
}  

public class ThreadJoinExample  
{  
public static void main (String argvs[])  
{  
 
ThreadJoin the1 = new ThreadJoin();  
Thread th1=new Thread(the1,"maya");
ThreadJoin the2 = new ThreadJoin();  
Thread th2=new Thread(the2,"Paya");
ThreadJoin the3 = new ThreadJoin(); 
Thread th3=new Thread(the3,"soya");
th1.start();  
try  
{  
System.out.println("The current thread name is: "+ Thread.currentThread().getName());  
th1.join();  
}   
catch(Exception e)  
{  
System.out.println("The exception has been caught " + e);  
} 
th2.start();  
try  
{  
System.out.println("The current thread name is: " + Thread.currentThread().getName());  
th2.join();  
}   
catch(Exception e)  
{  
System.out.println("The exception has been caught " + e);  
}  
th3.start();  
}  
}  