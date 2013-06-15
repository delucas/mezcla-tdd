import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MezclaTests {

	private Mezclador m;

	@Before
	public void setUp() {
		
		m = new Mezclador();
		
	}
	
	@Test
	public void queSePuedenMezclarArreglosVacios() {
		
		int[] a = new int[]{}, b = new int[]{};
		int[] c = m.mezclar(a, b);
		
		assertArrayEquals("Dos arreglos vacíos resultan en un arreglo vacío", new int[]{}, c);
		
	}
	
}
