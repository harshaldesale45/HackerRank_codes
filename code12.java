import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code12 {

    public static void main(String[] args) {
        int countn=0;
        int countm=0;
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int i=0; i < m; i++){
            apple[i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int j=0;j < n; j++){
            orange[j] = in.nextInt();
        }
         for(int i=0; i < m; i++){
            if (apple[i]>=(s-a) && apple[i]<=(t-a)){
                countm++;
            }
           
        }
        for(int j=0; j < n; j++){
          if(orange[j]<=(t-b) && orange[j]>=(s-b)){
              countn++;
          }
        }
        System.out.println(countm);
        System.out.println(countn);
    }
}
