package test;

class exam2 {
	
	public int[] Solution(int[]array, int[][] queries) {
		for (int i=0; i<queries.length; i++) {
			for(int j=0; j< array.length; j++) {
				if(queries[i][0] <= j && j <= queries[i][1]) {	
					array[j] +=1;
				}
			}
		}
		return array;
	}
}
public class examC {

	public static void main(String[] args) {

	}

}
