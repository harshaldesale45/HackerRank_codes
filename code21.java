import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code21 {

    public static void main(String[] args) {
        int catA;
        int catB;
        int x=0;
        int y=0;
        int z=0;
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
           x = in.nextInt();
           y = in.nextInt();
           z = in.nextInt();
            catA=Math.abs(x-z);
         catB=Math.abs(y-z);
        if (catA>catB){
            System.out.println("Cat B");}
            else if(catA<catB){
                System.out.println("Cat A");}
            else if(catA==catB){
                System.out.println("Mouse C");}
        
    }
      
         
    }
}
