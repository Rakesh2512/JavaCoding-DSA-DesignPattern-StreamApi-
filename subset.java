import java.util.ArrayList;
import java.util.List;

public class subset {
	
	public static void solve(int[] a ,int index,List<Integer>temp, List<List<Integer>>ans) {
		
		ans.add(new ArrayList<>(temp));
		
		for(int i = index; i<a.length;i++) {
			
//			if(i > index && a[i] == a[i-1]) {
//				continue;
//			}
			temp.add(a[i]);
			solve(a,i+1,temp,ans);
			temp.remove(temp.size()-1);
		}
	}

	public static List<List<Integer>>subset(int[] a) {
		
		List<List<Integer>>ans = new ArrayList<>();
		solve(a,0,new ArrayList<>(),ans);
		return ans;
	}
	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		
		int n = a.length;
		
		List<List<Integer>>ans = subset(a);
		System.out.println(ans);

	}

}
