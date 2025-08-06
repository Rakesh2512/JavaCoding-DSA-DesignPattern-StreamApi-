import java.util.ArrayList;
import java.util.List;

public class Permutation {
	
	public static void swap(char[] c,int l ,int r) {
		
		char ch = c[l];
		c[l] = c[r];
		c[r] = ch;
		
	}
	public static void permutate(char[] c, List<String>ans,int index, int n) {
		
		if(index == c.length) {
			ans.add(new String(c));
			return;
		}
		
		for(int i = index;i<n;i++) {
			swap(c,i,index);
			permutate(c,ans,index+1,n);
			swap(c,i,index);
		}
		
	}

	public static List<String>solve(String s){
		
		List<String>ans = new ArrayList<>();
		char[] c = s.toCharArray();
		permutate(c,ans,0,s.length());
		return ans;
		
	}
	
	public static void main(String[] args) {
		String s ="ABC";
		
		List<String>ans = solve(s);
		
		System.out.println(ans);
	}

}
