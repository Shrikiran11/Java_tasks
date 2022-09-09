package com.cf.javaTasks;
public class JavaYieldExp implements Runnable 
{  
    public void run()  
    {  
        for (int i=0; i<3 ; i++)  
            System.out.println(Thread.currentThread().getName() + " in control");  
    }  
    public static void main(String[]args)  
    {  
        JavaYieldExp tOne = new JavaYieldExp();  
        Thread t1=new Thread(tOne,"My1");
        JavaYieldExp tTwo = new JavaYieldExp();  
        Thread t2=new Thread(tTwo,"My2");
        // this will call run() method  
        t1.start();  
        t2.start();  
        t2.setPriority(10);
        for (int i=0; i<3; i++)  
        {  
            // Control passes to child thread  
            t1.yield();  
            System.out.println(Thread.currentThread().getName() + " in control");  
        }  
    }  
}  