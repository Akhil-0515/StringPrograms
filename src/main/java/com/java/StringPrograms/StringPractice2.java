package com.java.StringPrograms;

import java.io.*;
import java.util.*;

public class StringPractice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		int alength = A.length();
		int blength = B.length();
		int sumOflength = alength + blength;
		System.out.println(sumOflength);

		int s = A.compareTo(B);

		if (s > 0) {
			System.out.println("Yes");
		} else if (s < 0) {
			System.out.println("No");
		}

		String r = A.substring(0, 1).toUpperCase() + A.substring(1);
		String t = B.substring(0, 1).toUpperCase() + B.substring(1);
		System.out.println(r + " " + t);
	}
}
