import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code17 {

    public static void main(String[] args) {
        int index=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] store = new int [5];
        for(int types_i=0; types_i < n; types_i++){
            a[types_i] = in.nextInt();
        }
        for(int i=0 ; i < n ;i++){
            if(a[i]==1)
                count1++;
           else if(a[i]==2)
               count2++;
           else if(a[i]==3)
               count3++;
           else if(a[i]==4)
               count4++;
           else if(a[i]==5)
               count5++;
        }
        store[0]=count1;
        store[1]=count2;
        store[2]=count3;
        store[3]=count4;
        store[4]=count5;
        
    int heigh=store[0];
    for (int i=1;i<5;i++){
        if(store[i]>heigh){
            heigh=store[i];
            index=i;
        }
       else if(store[i]==heigh){
            index=i-1;
        }
    }
    System.out.println(index+1);
    }
}
