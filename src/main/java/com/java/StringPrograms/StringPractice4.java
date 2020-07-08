package com.java.StringPrograms;

import java.io.*;
import java.util.*;

public class StringPractice4 {

    public static void main(String[] args) {
        String r = "";
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        /* Enter your code here. Print output to STDOUT. */
        for(int i = A.length()-1; i>=0; i--)
        {
            r = r  + A.charAt(i);
        }
        if(A.equals(r)){
            System.out.println("Yes");
        }
        else{
             System.out.println("No");
        }
        
    }
}



