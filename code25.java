import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code25 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int ele = sc.nextInt();
        int n =sc.nextInt();
     
      
       int [] a = new int [n];
       for(int i=0;i<n;i++){
          a [i]  = sc.nextInt();
           }
    
        for(int i=0;i<n;i++){
        if(ele==a[i])
        System.out.println(i);
        }
        
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}