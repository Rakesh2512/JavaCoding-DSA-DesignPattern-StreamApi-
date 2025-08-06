import java.util.ArrayList;
import java.util.List;

public class PermutationOfNumber {
	
	public static void solve(int[] a,List<List<Integer>>ans,List<Integer>temp) {
		if(temp.size() == a.length) {
			ans.add(new ArrayList<>(temp));
			return;
		}
		
		for(int i = 0;i<a.length;i++) {
			if(temp.contains(a[i])) {
				continue;
			}
			temp.add(a[i]);
			solve(a,ans,temp);
			temp.remove(temp.size()-1);
		}
	}
	
	public static List<List<Integer>>permutate(int[] a){
		
		List<List<Integer>>ans = new ArrayList<>();
		
		solve(a,ans,new ArrayList<>());
		return ans;
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		
		List<List<Integer>> ans = permutate(a);
		
		System.out.println(ans);

	}

}
