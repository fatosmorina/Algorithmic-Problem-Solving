package leetcode.easy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NimGameTest {
    @InjectMocks
    NimGame nimGame;

    @Test
    public void shouldReturnFalse() {
	assertFalse(nimGame.canWinNim(4));
    }
    
    @Test
    public void shouldReturnFalse2() {
	assertFalse(nimGame.canWinNim(8));
    }
    
    @Test
    public void shouldReturnFalse3() {
	assertFalse(nimGame.canWinNim(12));
    }

    @Test
    public void shouldReturnTrue() {
	assertTrue(nimGame.canWinNim(2));
    }
    
    @Test
    public void shouldReturnTrue2() {
	assertTrue(nimGame.canWinNim(3));
    }
    
    @Test
    public void shouldReturnTrue3() {
	assertTrue(nimGame.canWinNim(5));
    }
    
    @Test
    public void shouldReturnTrue4() {
	assertTrue(nimGame.canWinNim(6));
    }
    
    @Test
    public void shouldReturnTrue5() {
	assertTrue(nimGame.canWinNim(7));
    }
    
    @Test
    public void shouldReturnTrue6() {
	assertTrue(nimGame.canWinNim(9));
    }
    
    @Test
    public void shouldReturnTrue7() {
	assertTrue(nimGame.canWinNim(10));
    }
    
    @Test
    public void shouldReturnTrue8() {
	assertTrue(nimGame.canWinNim(11));
    }
}
