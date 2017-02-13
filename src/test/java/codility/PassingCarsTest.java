package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PassingCarsTest {
    @InjectMocks
    PassingCars passingCars;

    @Test
    public void shouldReturnFive(){
	int[] array = {0, 1, 0, 1, 1};
	assertEquals(5, passingCars.solution(array));
    }
    
    @Test
    public void shouldReturnEight(){
	int[] array = {0, 1, 0, 1, 1, 0, 1};
	assertEquals(8, passingCars.solution(array));
    }
}
