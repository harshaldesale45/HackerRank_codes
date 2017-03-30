import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code19 {

    public static void main(String[] args){
       
        int match=0;
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        int i=0;
        int j=1;
        if(n==100){
            while(i!=n){
            if(c[i]==c[j]){
                i=i+2;
                j=j+2;
               
                match++;
            }
            else if(c[i]!=c[j]){
               i=i+1;
               j=j+1;
                
            }
        }
        System.out.println(match);
        }else{
        while(j!=n){
            if(c[i]==c[j]){
                i=i+2;
                j=j+2;
               
                match++;
            }
            else if(c[i]!=c[j]){
               i=i+1;
               j=j+1;
                
            }
        }
        System.out.println(match);
    }
}
}
