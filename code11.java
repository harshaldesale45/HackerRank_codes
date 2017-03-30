import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code11 {

    public static void main(String[] args) {
        int grade1=0;
        int grade;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
             grade = in.nextInt();
            if(grade<38 || grade%5==0){
                grade1= grade;
            }
           else if(grade%5 <= 2 && grade%5 > 0 ){
                grade1 = grade;
                
            } else if(grade%5 > 2 && grade%5 < 5){
                grade1 = grade+(5 - grade%5);
                
            }
           
             
             System.out.println(grade1);
        }
         
    }
}
