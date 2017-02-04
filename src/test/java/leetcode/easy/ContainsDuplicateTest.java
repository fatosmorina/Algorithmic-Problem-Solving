package leetcode.easy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ContainsDuplicateTest {
    @InjectMocks
    ContainsDuplicate containsDuplicate;

    @Test
    public void shouldReturnFalseForDuplicate() {
	int[] nums = { 1, 2, 3, 1 };
	assertTrue(containsDuplicate.containsDuplicate(nums));
    }
    
    @Test
    public void shouldReturnTrueForUnique() {
	int[] nums = { 1, 2, 3, 4};
	assertFalse(containsDuplicate.containsDuplicate(nums));
    }
    
    @Test
    public void shouldReturnFalseForEmptyArray() {
	int[] nums = {};
	assertFalse(containsDuplicate.containsDuplicate(nums));
    }
}
