package src;
import java.io.*;
import java.util.*;

public class StringsIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String s1 = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        String s2 = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
        
        int length = A.length() + B.length();
        System.out.println(length);
        
        int compare = A.compareTo(B);
        if (compare <= 0) {
        	System.out.println("No");
        }
        else {
        	System.out.println("Yes");
        }
        System.out.println(s1 + " " + s2);
    }
}
