package codility;

public class CountDiv {
    public int solution(int a, int b, int k) {
	return b / k - a / k + (a % k == 0 ? 1 : 0);
    }
}
