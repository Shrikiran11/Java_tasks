
import java.util.*;
 
class GetSet {
    private String name;
    public String getName() { return name; }
    public void setName(String N)
    {
        this.name = N;
    }
    private int id;
    private int age;
   
    private String desig;
    private long phno;

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }
    public void setPhno(long phno) {
        this.phno = phno;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getDesig(){
        return desig;
    }
    public long getPhno() {
        return phno;
    }

}

class GetterAndSetter {
 
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the employee name");
        String str=scn.next();
        System.out.println("enter the employee age");
        int age=scn.nextInt();
        System.out.println("enter the employee id");
        int id=scn.nextInt();
        System.out.println("enter the employee desig");
        String desig=scn.next();
        System.out.println("enter the employee phno");
        long phno=scn.nextLong();
        GetSet obj = new GetSet();
 
        
        obj.setName(str);
        obj.setAge(age);
        obj.setId(id);
        obj.setDesig(desig);
        obj.setPhno(phno);
        
        System.out.println(" Employee Name is "+obj.getName()+" Employee id is "+obj.getId()+" Employee designation is "+obj.getDesig()+" Employee phone number is "+obj.getPhno()+" Employee Age is "+obj.getAge());
    }
}