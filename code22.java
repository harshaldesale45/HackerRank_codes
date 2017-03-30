import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code22 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String str;
        str=sc.next();
        StringBuilder sb = new StringBuilder(str);
        int n=str.length();
        int i;
        for(i=0;i<n-1;i++) {
            if(sb.charAt(i)==sb.charAt(i+1)) {
                sb.delete(i,i+2);
                i=i-2;n=n-2;
                if(i<-1)
                    i=-1;
            }
        }
        
        if(sb.toString().equals("")){
            System.out.println("Empty String");
        }
        else {
            System.out.println(sb);
        }
    }
}
