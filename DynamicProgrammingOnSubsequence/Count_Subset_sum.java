package DynamicProgrammingOnSubsequence;

import java.util.Arrays;

public class Count_Subset_sum {
	
	public static int wayss(int[] arr,int index,int target,int[][] dp) {
		
		if(target == 0) {
			return 1;
		}
		
		if(index == 0) {
			return target == arr[0] ? 1 : 0;
		}
		
		if(dp[index][target] != -1) {
			return dp[index][target];
		}
		int notPick = wayss(arr,index-1,target,dp);
		int pick = 0;
		
		if(arr[index] <= target) {
			pick = wayss(arr,index-1,target-arr[index],dp);
		}
		return dp[index][target] = pick + notPick;
	}

	public static int ways(int[] arr,int target) {
		
		int[][] dp = new int[arr.length][target+1];
		for(int[] r : dp) {
			Arrays.fill(r, -1);
		}
		return wayss(arr,arr.length-1,target,dp);
	}
	public static void main(String[] args) {
		
		
		int arr[] = {1, 2, 2, 3};
        int k = 3;
        
        System.out.print("Number of Subser sum is :"+ways(arr,k));
	}

}
