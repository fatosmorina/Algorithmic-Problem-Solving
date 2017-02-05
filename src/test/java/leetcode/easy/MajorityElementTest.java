package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MajorityElementTest {

    @InjectMocks
    MajorityElement majorityElement;
    
    @Test
    public void shouldReturnOne(){
	int[] nums = {1, 2, 1};
	assertEquals(1, majorityElement.majorityElement(nums));
    }
    
    @Test
    public void shouldReturnThree(){
	int[] nums = {3, 2, 3};
	assertEquals(3, majorityElement.majorityElement(nums));
    }
}
