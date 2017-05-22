package hackerrank.algorithms.warmup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import hackerrank.algorithms.strings.CamelCase;

@RunWith(MockitoJUnitRunner.class)
public class CamelCaseTest {
    @Mock
    CamelCase camelCase;

    @SuppressWarnings("static-access")
    @Test
    public void shouldReturnFive() {
        String word = "saveChangesInTheEditor";
        assertEquals(5, camelCase.getNumberOfWords(word));
    }
   
}
