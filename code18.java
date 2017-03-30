import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code18 {

    public static void main(String[] args) {
        int sum=0;
        int sum1=0;
        int refund=0;
        
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k_item = sc.nextInt();
        
        int [] a = new int[n];
        for(int i=0 ; i<n ; i++){
            a[i]=sc.nextInt();
            
        }
        int b_charge = sc.nextInt();
        
        for(int i=0;i<n;i++){
            sum = sum +a[i];
                 
        }
        
         sum1= sum - a[k_item];
    
        if(sum1/2==b_charge){
            System.out.println("Bon Appetit");
        }else {
           refund=a[k_item]/2;
            
            System.out.println(refund);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}