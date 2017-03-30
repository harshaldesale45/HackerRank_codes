import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code8 {

    public static void main(String[] args) {
        int i,j;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (i=1;i<=n;i++){
            for(j=1;j<=n-i;j++)
                {
            System.out.print(" ");
        }
            for(j=n-i+1;j<=n;j++){
                System.out.print("#");
                
            }
        
         System.out.println();
        }
}
}