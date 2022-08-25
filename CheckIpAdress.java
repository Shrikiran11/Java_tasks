import java.util.*;

class CheckIpAdress {
    static void checkIp(String str) {
        String[] array = str.split("[.]");
        boolean check = true;
        String key = "";
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            key = array[i];
            temp = Integer.valueOf(key);
            System.out.println(temp);
            if (temp > 0 && temp <= 255) {
                check = true;
            } else {
                check = false;
            }
            if (check == false)
                break;
        }
        if (check == true && array.length == 4) {
            System.out.println("valid Ip address");
        } else {
            System.out.println("Invalid Ip address");
        }

    }

    public static void main(String[] args) {
        System.out.println("enter");
        Scanner scn = new Scanner(System.in);
        String ip = scn.next();
        checkIp(ip);
    }
}