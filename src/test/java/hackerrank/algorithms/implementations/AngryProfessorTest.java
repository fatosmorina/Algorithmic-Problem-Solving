package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AngryProfessorTest {
    @InjectMocks
    AngryProfessor angryProfessor;

    @Test
    public void shouldReturnYes() {
	int[] time = {-1,-3,4,2};
	assertEquals("YES", angryProfessor.isClassCanceled(4, 3, time));
    }
    
    @Test
    public void shouldReturnNO() {
	int[] time = {0, -1, 2, 1};
	assertEquals("NO", angryProfessor.isClassCanceled(4, 2, time));
    }
}
