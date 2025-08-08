package Greedy;

import java.util.Arrays;

public class ActivitySelection {

	
	public static int solve(int[] start,int [] finish) {
		
		int n = start.length;
		int[][] ans = new int[n][2];
		
		for(int i =0;i<n;i++) {
			
			ans[i][0] = start[i];
			ans[i][1] = finish[i];
		}
		
		Arrays.sort(ans,(a,b) -> a[1]-b[1]);
		
		int end = ans[0][1];
		
		int count = 1;
		
		for(int i = 1;i<n;i++) {
			if(ans[i][0] >= end) {
				count++;
				end = ans[i][1];
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		
		int[] start = {1, 3, 0, 5, 8, 5}; 
		int[] finish =  {2, 4, 6, 7, 9, 9};
		
		int MaximumActivity = solve(start,finish);
		
		System.out.println(MaximumActivity);

	}

}
