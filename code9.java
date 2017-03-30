import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code9.java {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a[]=new long [5];
       for(int i=0; i<5 ; i++){
           a[i]=in.nextLong();
           
       }
        Arrays.sort(a);
       
        System.out.print(a[0]+a[1]+a[2]+a[3]);
        System.out.print(" "+(a[1]+a[2]+a[3]+a[4]));
    
    }
}
