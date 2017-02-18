package hackerrank.algorithms.implementations;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//https://www.hackerrank.com/challenges/sock-merchant
public class SockMerchant {

    public int solution(int n, int[] array) {
	int counter = 0;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	for (int i = 0; i < n; i++) {
	    Integer index = map.get(array[i]);
	    if (index == null) {
		map.put(array[i], 1);
	    } else {
		map.put(array[i], index + 1);
	    }
	}
	for (Entry<Integer, Integer> element : map.entrySet()) {
	    int value = element.getValue();
	    counter = counter + value / 2;
	}
	return counter;
    }
}
