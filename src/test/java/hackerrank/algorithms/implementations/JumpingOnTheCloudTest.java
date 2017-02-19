package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class JumpingOnTheCloudTest {

    @InjectMocks
    JumpingOnTheCloud jumpingOnTheCloud;

    @Test
    public void shouldReturnNinetyTwo() {
	int[] clouds = { 0, 0, 1, 0, 0, 1, 1, 0 };
	assertEquals(92, jumpingOnTheCloud.getEnergyBalance(8, 2, clouds));
    }

    @Test
    public void shouldReturnNinetySeven() {
	int[] clouds = { 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, };
	assertEquals(97, jumpingOnTheCloud.getEnergyBalance(19, 19, clouds));
    }
}
