import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        
        if (n%2==0){
            if (p==n || p ==1){
                System.out.println("0");
            }
           else if(p<=n/2){
              System.out.println(p/2);
            }
            else if(p>n/2){
                 System.out.println((n-p)/2);
            }
        }else if(n%2==1){
            if (p==n || p==n-1 || p==1){
                System.out.println("0");
            }
           else if (p<=n/2){
              System.out.println(p/2);  
            }
            else if(p>n/2){
              System.out.println((n-p)/2);  
            }
        }
        }
}