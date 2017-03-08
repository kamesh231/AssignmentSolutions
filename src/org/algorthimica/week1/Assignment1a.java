package org.algorthimica.week1;

import java.util.Random;

//CountZeroes Problem

public class Assignment1a {

	// Find the first set of zeroes
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int[] inputArray = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			inputArray[i] = r.nextInt(4);

		}
		long begin = System.currentTimeMillis();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (inputArray[i] == 0) {
				count++;
			} else {
				break;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(count);
		System.out.println("time taken is " + (end - begin) / 1000 + " Seconds");
	}

}
