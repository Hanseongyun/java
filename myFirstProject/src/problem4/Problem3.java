package problem4;

public class Problem3 {
	
    public int solution(int number) {
        if (number <= 0) return 0;

        int result = 0;

        while (number > 0) {
            result += number % 10;
            number /= 10;
        } 

        return result;
    }

	public static void main(String[] args) {

	}

}
