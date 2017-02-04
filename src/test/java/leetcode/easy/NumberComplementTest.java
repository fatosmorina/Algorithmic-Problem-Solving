package leetcode.easy;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NumberComplementTest {

    @InjectMocks
    NumberComplement numberComplement;

    @Test
    public void shouldReturnComplementOfNumberFive() {
	assertEquals(2, numberComplement.findComplement(5));
    }
    
    @Test
    public void shouldReturnComplementOfNumberSeventeen() {
	assertEquals(14, numberComplement.findComplement(17));
    }

}
