package leetcode.easy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DetectCapitcalTest {
    @InjectMocks
    DetectCapital detectCapital;

    @Test
    public void shouldReturnTrue() {
	assertTrue(detectCapital.detectCapitalUse("abc"));
    }

    @Test
    public void shouldReturnTrue2() {
	assertTrue(detectCapital.detectCapitalUse("ABC"));
    }

    @Test
    public void shouldReturnTrue3() {
	assertTrue(detectCapital.detectCapitalUse("Abc"));
    }

    @Test
    public void shouldReturnTrue4() {
	assertTrue(detectCapital.detectCapitalUse("GG"));
    }

    @Test
    public void shouldReturnFalse() {
	assertFalse(detectCapital.detectCapitalUse("ABc"));
    }

    @Test
    public void shouldReturnFalse2() {
	assertFalse(detectCapital.detectCapitalUse("AbC"));
    }

}
