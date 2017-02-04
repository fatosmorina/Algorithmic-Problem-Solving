package leetcode.easy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HappyNumberTest {
    @InjectMocks
    HappyNumber happyNumber;
    
    @Test
    public void shouldReturnTrueForNineteen(){
	assertTrue(happyNumber.isHappy(19));
    }
    
    @Test
    public void shouldReturnFalseForTwentyThree(){
	assertFalse(happyNumber.isHappy(22));
    }
}
