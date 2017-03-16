package hackerrank.algorithms.warmup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class TimeConversionTest {
    @InjectMocks
    TimeConversion timeConversion;

    @Test
    public void shouldReturnTimeInAM() {
        String input = "12:00:00AM";
        String expectedOutput = "00:00:00";
        assertEquals(expectedOutput, timeConversion.getFormattedTime(input.split(":")));
    }

    @Test
    public void shouldReturnTimeInPM() {
        String input = "07:05:45PM";
        String expectedOutput = "19:05:45";
        assertEquals(expectedOutput, timeConversion.getFormattedTime(input.split(":")));
    }

    @Test
    public void shouldReturnTimeInPM2() {
        String input = "12:45:54PM";
        String expectedOutput = "12:45:54";
        assertEquals(expectedOutput, timeConversion.getFormattedTime(input.split(":")));
    }

}
