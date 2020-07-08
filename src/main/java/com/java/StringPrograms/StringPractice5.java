package com.java.StringPrograms;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class StringPractice5  {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        SortedSet<String> s1 = new TreeSet<String>();
        for(int i=0; i<= s.length()-k; i++)
        {
            s1.add(s.substring(i,i+k));
        }
        smallest = s1.first();
        largest = s1.last();
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}