package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HammingDistanceTest {
    @InjectMocks
    HammingDistance hammingDistance;

    @Test
    public void shouldReturnTwo() {
	assertEquals(2, hammingDistance.hammingDistance(1, 4));
    }
    
    @Test
    public void shouldReturnSix() {
	assertEquals(5, hammingDistance.hammingDistance(1, 63));
    }
}
