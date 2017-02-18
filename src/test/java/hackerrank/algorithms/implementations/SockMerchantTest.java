package hackerrank.algorithms.implementations;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SockMerchantTest {

    @InjectMocks
    SockMerchant sockMerchant;

    @Test
    public void shouldReturnThree() {
	int[] array = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
	assertEquals(3, sockMerchant.solution(9, array));
    }
}
