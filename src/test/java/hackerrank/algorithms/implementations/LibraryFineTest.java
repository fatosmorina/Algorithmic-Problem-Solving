package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class LibraryFineTest {
    @InjectMocks
    LibraryFine libraryFine;

    @Test
    public void shouldReturn45() {
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("actualDay", 21);
	map.put("actualMonth", 2);
	map.put("actualYear", 2017);
	map.put("expectedDay", 18);
	map.put("expectedMonth", 2);
	map.put("expectedYear", 2017);
	assertEquals(45, libraryFine.getFine(map));
    }
    
    @Test
    public void shouldReturn545() {
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("actualDay", 21);
	map.put("actualMonth", 2);
	map.put("actualYear", 2017);
	map.put("expectedDay", 18);
	map.put("expectedMonth", 1);
	map.put("expectedYear", 2017);
	assertEquals(545, libraryFine.getFine(map));
    }
}
