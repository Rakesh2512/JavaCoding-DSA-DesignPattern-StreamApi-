import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermutationOf101 {

	
	public static void swap(char c[],int l,int r) {
		char ch = c[l];
		c[l] = c[r];
		c[r] = ch;
		
	}
	public static void permu(char c[],int index,List<String>ans) {
		
		if(index == c.length) {
			ans.add(new String(c));
			return;
		}
		
		
		HashSet<Character> st = new HashSet<>();
		
		for(int i =index;i<c.length;i++) {
			if(st.contains(c[i])) {
				continue;
			}
			st.add(c[i]);
			swap(c,i,index);
			permu(c,index+1,ans);
			swap(c,i,index);
			
		}
	}
	
	public static List<String>solve(String s,int n){
		
		List<String>ans = new ArrayList<>();
		
		char[] c = s.toCharArray();
		
		permu(c,0,ans);
		return ans;
		
	}
	public static void main(String[] args) {
		
		String s = "101";
		
		List<String>ans = solve(s,s.length());
		
		System.out.println(ans);

	}

}
