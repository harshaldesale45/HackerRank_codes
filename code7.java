import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code7 {

    public static void main(String[] args) {
        double pos=0.0;
          double neg=0.0;
         double zero=0.0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for (int i=0; i< n; i++){
            if (arr[i]>0)
                {
                pos++;
               
            }else if(arr[i]<0){
                neg++;
            }
            else if(arr[i]==0){
                zero++;
            }
            
        }
        
        System.out.println(pos/n);
         System.out.println(neg/n);
         System.out.println(zero/n);
    }
}
