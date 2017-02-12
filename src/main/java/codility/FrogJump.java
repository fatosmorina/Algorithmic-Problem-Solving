package codility;

public class FrogJump {

    public int solution(int x, int y, int d) {
	return (int) Math.ceil((y - x) * 1.0 / d);
    }
}
