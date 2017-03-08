/**
 * 
 */
package org.algorthmica.week5;
import java.util.Scanner;

/**
 * @author Kaamesh
 *
 *Given statements - A is an array of sorted n distinct integers.
 *					 Few numbers can be negative.
 *	Anchor statement -> a[i]=i
 *  Find an anchor				
 */

/**
 * 
 * @author Kaamesh
 *  Proposed Algorithm -> Traverse through array to find if i matches to a[i] if a[i] is negative
 */
public class AnchorIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

	    System.out.println("enter number of elements");

	    int n=s.nextInt();

	    int arr[]=new int[n];

	    System.out.println("enter elements");

	    for(int i=0;i<n;i++){//for reading array
	        arr[i]=s.nextInt();
	        
	        
	    }
	  //  withOutRecursion(arr);
	    withRecursion(arr);
	}
	
	public static void withOutRecursion(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>0) {
	        	
	        	if (arr[i]==i+1) {
	        		System.out.println("Found the anchor "+arr[i]);
	        	}
	        }
		}
		
		

	}
	public static void withRecursion(int arr[]) {
		
		recursion(arr,0,arr.length);
	}
	
	public static int[]  recursion(int arr[],int begin,int end) {
		if (begin >1 && end >1) {
		arr=recursion(arr,begin,end/2);
		arr=recursion(arr,end/2+1,end-1);
		}
		for (int i=begin;i<=end;i++) {
				if (arr[i]>0) {
	        	
	        	if (arr[i]==i+1) {
	        		System.out.println("Found the anchor "+arr[i]);
	        	}
	        }
		}
		
		return arr;
		
	}
}
