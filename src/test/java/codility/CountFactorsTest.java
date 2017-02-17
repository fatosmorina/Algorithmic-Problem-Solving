package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CountFactorsTest {
    @InjectMocks
    CountFactors countFactors;

    @Test
    public void shouldReturnFive() {
	assertEquals(5, countFactors.solution(16));
    }

    @Test
    public void shouldReturnEight() {
	assertEquals(8, countFactors.solution(24));
    }

    @Test
    public void shouldReturnNine() {
	assertEquals(9, countFactors.solution(36));
    }

}
