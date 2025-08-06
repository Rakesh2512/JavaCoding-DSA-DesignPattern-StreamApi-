
public class FindRowWithMaxRow {

	
	public static int findIndex(int mat[][],int n) {
		
		int index = -1;
		int count = 0;
		int max_count = 0;
		
		for(int i =0;i<n;i++) {
			count = 0;
			for(int j =0;j<mat[0].length;j++) {
				if(mat[i][j] == 1) {
					count++;
				}
			}
			if(max_count < count) {
				max_count = count;
				index = i;
			}
		}
		
		return max_count;
	}
	public static void main(String[] args) {
		
		int mat[][] = { {0, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};

		
		int index = findIndex(mat,mat.length);
		
		System.out.println(index);
	}
	
	
	
}
