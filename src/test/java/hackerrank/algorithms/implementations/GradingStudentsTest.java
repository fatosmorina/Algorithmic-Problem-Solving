package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class GradingStudentsTest {

    @InjectMocks
    GradingStudents gradingStudents;

    @Test
    public void shouldReturn75() {
        assertEquals(75, gradingStudents.roundGrade(73));
    }
    
    @Test
    public void shouldReturn67() {
        assertEquals(67, gradingStudents.roundGrade(67));
    }
}
