import java.util.*;

class PromptingReplace {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter String to Search");
        Scanner scn = new Scanner(System.in);
        String key = scn.next();
        System.out.println("Enter word to replace");
        String word = scn.next();
        String para = "Java is the name of a programming language created by Sun Microsystems. This company was bought out by Oracle Corporation, which continues to keep it up to date. The latest version is Java 18, released in March 2022 (supported until September 2022) while Java 17, the latest long-term support (LTS), was released on September, 14th 2021.[1] Being an LTS version means that it will continue getting updates for multiple years. ";
        para = para.replaceAll("[()?:!.,;{}-]+", " ");
        String[] search = para.split(" ");

        for (int i = 0; i < search.length; i++) {

            if (search[i].equals(key)) {
                System.out.println("Enter yes/no to replace");
                String choice = scn.next();
                if (choice.equals("yes")) {
                    search[i] = word;
                }
            }
        }
        for (int i = 0; i < search.length; i++) {
            System.out.print(search[i] + " ");
        }
    }
}