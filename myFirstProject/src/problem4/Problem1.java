package problem4;

public class Problem1 {

	  public int solution(int[] numberList) {
	        for (int index = 0; index < numberList.length; index++)
	            if (numberList[index] < 0) return index;
	        return -1;
	    } 
	
	public static void main(String[] args) {
	
	}

}
