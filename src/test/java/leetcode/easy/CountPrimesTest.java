package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CountPrimesTest {
    @InjectMocks
    CountPrimes countPrimes;

    @Test
    public void shouldReturnThree() {
	assertEquals(countPrimes.countPrimes(5), 2);
    }
    
    @Test
    public void shouldReturnFour() {
	assertEquals(countPrimes.countPrimes(7), 3);
    }
}
