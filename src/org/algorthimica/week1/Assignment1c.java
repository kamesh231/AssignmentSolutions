package org.algorthimica.week1;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * @author Kaamesh
 * Find Duplicates in 1..N-1 
 * For every i 
 */
public class Assignment1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n = Integer.parseInt(args[0]);
    int[] num = new int[n];
    Random r = new Random();
    for (int i=0;i<n;i++) {
    	num[i]=(r.nextInt(n-1))+1;
    }
    
    Arrays.sort(num);
    int temp=num[0];
    for (int i=1;i<n;i++) {
    	if (temp==num[i]) {
    		System.out.println("Duplicate is "+temp);
    	}
    	else {
    		temp=num[i];
    	}
    }
	}

}
