import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code6{

    public static void main(String[] args){
        int sum=0;
    int diff=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                
            }
        }
        
        for(int a_i=0; a_i<n  ; a_i++){
            sum=sum+a[a_i][a_i];
            
        }
        for(int a_i=0; a_i<n  ; a_i++){
            diff=diff+a[a_i][n-1-a_i];
       
        }
    System.out.println(Math.abs(diff-sum));
    }
}
