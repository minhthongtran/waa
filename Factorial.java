package com.apolis.yulin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Factorial {
  
	public static void main(String[] args) {
	    int n = 1, m = 100; 
		System.out.println(solve(n, m));  
    }	
	private static List<Integer> solve(int m, int n) {
		
		double[] dp = new double[n + 1];// 90 91, 92, 93.. 100
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		for(int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] * i;	
		}
		
		List<Integer> res = new ArrayList<>();
		for(int i = m; i <= n; i++) {
			String str = dp[i] + "";
		
			if((str.charAt(0) - '0') % 2 == 0) {
				
				res.add(i);
			}
		}		
		if(res.size() == 0) 
			res.add(0);
		
		return res;// output of the factorial starts with a even number
	}
}
