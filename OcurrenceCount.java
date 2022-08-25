import java.util.*;

class OccurenceCount {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter String to Search");
        Scanner scn = new Scanner(System.in);
        String key = scn.next();
        String para = "Java is the name of a programming language created by Sun Microsystems. This company was bought out by Oracle Corporation, which continues to keep it up to date. The latest version is Java 18, released in March 2022 (supported until September 2022) while Java 17, the latest long-term support (LTS), was released on September, 14th 2021.[1] Being an LTS version means that it will continue getting updates for multiple years. ";
        para = para.replaceAll("[()?:!.,;{}-]+", " ");
        String[] search = para.split(" ");

        for (int i = 0; i < search.length; i++) {

            if (search[i].equals(key))
                count++;
        }
        System.out.println(count);
        if (count == 0)
            System.out.println("Element not found");
        else
            System.out.println(key + " has occured " + count + " times");
    }
}