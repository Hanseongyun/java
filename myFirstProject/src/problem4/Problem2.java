package problem4;

public class Problem2 {

    public int[] solution(int[] array, int[][] queries) {
        for (int[] query: queries)
            for (int index = query[0]; index <= query[1]; index++) array[index]++;
        
        return array;
    }
    
	public static void main(String[] args) {

	}

}
