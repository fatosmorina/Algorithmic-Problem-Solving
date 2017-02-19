package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class SaveThePrisonerTest {
    @InjectMocks
    SaveThePrisoner saveThePrisoner;

    @Test
    public void shouldReturnTwo() {
	assertEquals(2, saveThePrisoner.returnIndex(5, 2, 1));
    }
}
