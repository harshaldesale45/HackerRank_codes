import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code16 {

    public static void main(String[] args) {
        int heigh=0;
        int low=0;
       int counth=0;
        int countl=0;
        
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
      heigh =  score[0];
      low =   score[0];
        for(int i=1; i<n ; i++){
            if(score[i]>heigh){
                counth++;
                heigh=score[i];
            }
           else if(score[i]<low){
                countl++;
               low=score[i];
               }
        }
        System.out.println((counth)+" "+(countl));
    }
}
