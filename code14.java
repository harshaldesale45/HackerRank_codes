import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code14 {

    public static void main(String[] args) {
        int counta=0;
        int countb=0;
        int conter=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int j=0; j < m; j++){
            b[j] = in.nextInt();
        }
        for (int k=a[n-1];k<=b[0];k++){
            for(int l=0;l<n;l++){
            if (k%a[l]==0){
                counta++;
            }
            }if(counta==n){
       
            for(int x=0;x<m;x++){
            if (b[x]%k==0){
                countb++;
            }
            }if (countb==m){
                conter++;
            }
            }
        }
        System.out.println(conter);
        }
    }