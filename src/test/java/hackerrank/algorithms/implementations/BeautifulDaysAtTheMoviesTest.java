package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class BeautifulDaysAtTheMoviesTest {

    @InjectMocks
    BeautifulDaysAtTheMovies beautifulDaysAtTheMovies;

    @Test
    public void shouldReturnTwo() {
	assertEquals(2, beautifulDaysAtTheMovies.countBeautifulDays(20, 23, 6));
    }
}
