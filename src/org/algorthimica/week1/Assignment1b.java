package org.algorthimica.week1;

import java.util.Random;

/**
 * 
 * @author Kaamesh Polynomial Evaluation Program
 *
 */
public class Assignment1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Real number x
		int x = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);

		Random r = new Random();
		int[] coef = new int[n];
		for (int i = 0; i < n; i++) {
			coef[i] = r.nextInt(200);
		}

		System.out.println(EvalPolynomial(coef, x, n));
	}

	public static double EvalPolynomial(int[] coef, int x, int n) {
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + (coef[i] * (Math.pow((double) x, (double) i)));
		}
		return sum;
	}
}
