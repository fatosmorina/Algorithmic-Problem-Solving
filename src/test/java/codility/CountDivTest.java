package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class CountDivTest {

    @InjectMocks
    CountDiv countDiv;

    @Test
    public void shouldReturnThree() {
	assertEquals(3, countDiv.solution(6, 11, 2));
    }
}
