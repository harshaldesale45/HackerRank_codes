import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int x,v;
        x=x1-x2;
        v=v2-v1;
            if((x==0)&&(v==0))
                System.out.println("YES");
            if((x!=0)&&(v==0))                    
                System.out.println("NO");
            else
                {
                if(x%v==0)
                    {
                    if(x/v<0)
                    System.out.println("NO");
                    else
                    System.out.println("YES");
                    }
                else
                System.out.println("NO");
                }
        }
    }