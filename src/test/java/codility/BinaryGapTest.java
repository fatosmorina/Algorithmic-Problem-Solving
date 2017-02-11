package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BinaryGapTest {
    @InjectMocks
    BinaryGap binaryGap;
    
    @Test 
    public void shouldReturnTwo(){
	assertEquals(2, binaryGap.solution(9));
    }
}
