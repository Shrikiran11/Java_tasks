import java.util.*;

class StringIntern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the animal to add to zoo");
        String input = scn.next();
        System.out.println("Enter the animal to check");
        String input1 = scn.next();
        String s3 = input1;
        String animal1 = new String("cat");
        String animal2 = input.intern();
        System.out.println(animal1 == animal2);

        boolean check;
        if (animal1 == animal2)
            check = true;
        else
            check = false;
        if (check == true)
            System.out.println("put in same cage");
        else
            System.out.println("put in different cage");

    }
}