package DynamicProgrammingOnSubsequence;

import java.util.Arrays;

public class SubsetSumEqualToTarget {

	
	public static boolean solve(int[] a,int index, int target,boolean dp[][]) {
		
		if(target == 0) {
			return true;
		}
		
		if(index == 0) {
			return target == a[0];
		}
		
		if(dp[index][target]) {
			
			return true;
		}
		
		boolean notPick = solve(a,index-1,target,dp);
		boolean Pick = false;
		
		if(a[index] <= target) {
			Pick = solve(a,index-1,target-a[index],dp);
		}
		
		dp[index][target] = Pick || notPick;
		return Pick || notPick;
	}
	public static boolean CheckSubset(int[] a,int n,int target) {
		
		boolean[][] dp = new boolean[n][target+1];
		
		if(n == 0) {
			if(target == 0) {
				return true;
			}
		}
		if(target < 0) {
			return false;
		}
		
		return solve(a,n-1,target,dp);
	}
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		
		int n = a.length;
		
		int target = 4;
		
		boolean ans = CheckSubset(a,n,target);
		if(ans) {
			System.out.println("Yes Subset is Exist");
		}
		else {
			System.out.println("No Subset is not Exist");
		}

	}

}
