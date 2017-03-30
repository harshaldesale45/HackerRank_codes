import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        int r;
        String[] arr = time.split(":");
        if(arr[2].charAt(2)=='A')
            {
            String [] sec = arr[2].split("A");
            if (arr[0].charAt(0)=='1' && arr[0].charAt(1)=='2')
            {
                arr[0]="00";
            }
           System.out.print(arr[0]+":"+arr[1]+":"+sec[0]) ;
       }
   
    if(arr[2].charAt(2)=='P')
        {
        r =Integer.parseInt(arr[0]);
        if(r==12)
            {
           r = r + 0;
        }else
        {
        r = (r + 12);
        }
       
        String [] sec = arr[2].split("P");
        if(r<10)
            {
             System.out.print("0"+r+":"+arr[1]+":"+sec[0]);
        }else
        System.out.print(r+":"+arr[1]+":"+sec[0]);
        
    }
    }
}
