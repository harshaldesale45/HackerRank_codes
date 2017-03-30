import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code23 {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        String s = in.next();
       StringBuilder sb = new StringBuilder(s);
        String[] r = s.split("(?=\\p{Upper})");
       
        System.out.println(r.length);
        
    }
    
}
