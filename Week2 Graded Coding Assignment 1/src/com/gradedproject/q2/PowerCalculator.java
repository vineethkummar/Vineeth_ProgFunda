package com.gradedproject.q2;

public class PowerCalculator {
	public long calculatePower(int x, int n) {
		if (n < 0) {
			System.out.println("please enter a non-negative value for N.");
			return -1;
		}
		if (n==0) {
			return 1;
		} else if (n % 2 == 0) {
			long halfPOW = calculatePower(x, n/2);
			return halfPOW * halfPOW;
		} else {
			long halfPOW = calculatePower(x, (n-1)/2);
			return x * halfPOW * halfPOW;
			
		}
	}

}
