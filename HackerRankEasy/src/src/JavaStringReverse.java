package src;
import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String sb = new StringBuilder(A).reverse().toString();
        
        if (A.equals(sb)) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
        
        
    }
}
