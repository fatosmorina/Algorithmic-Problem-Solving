package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class DrawingBookTest {
    @InjectMocks
    DrawingBook drawingBook;

    @Test
    public void shouldReturnZero() {
        assertEquals(0, drawingBook.getMinimumNumberOfPage(5, 4));
    }

    @Test
    public void shouldReturnOne() {
        assertEquals(1, drawingBook.getMinimumNumberOfPage(6, 2));

    }
}
