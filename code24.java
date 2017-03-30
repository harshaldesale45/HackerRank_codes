import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        
        
        String buffer = "";
    for (int i = 0; i < s.length(); i++) {
        if (!buffer.contains(String.valueOf(s.charAt(i)))) {
            buffer += s.charAt(i);
        }
        
    }
       String newstr = "";
        
       for(int i=0;i<buffer.length();i++){
           for(int j=1;j<buffer.length();j++){
              for(int k=0;k<s.length();k++){
                  if(buffer.charAt(i)==s.charAt(k)||buffer.charAt(j)==s.charAt(k)){
                      newstr +=s.charAt(k);
                      
                      
                      
                  }
              }
           }
      
       } 
        int max=0;
        int count=0;
        
        
        int length=newstr.length();
        for(int i=0;i<newstr.length()-1;i++){
            if(newstr.charAt(i)!=newstr.charAt(i+1)){
                count++;
                if(max<count);
                max=count;
            }
                else if(newstr.charAt(i)==newstr.charAt(i+1)){
                   count=0;
                }
            
        }
        System.out.println(max-1);
    }
    
}
