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
	
	@Test
	public void queElPrimerArregloPuedeEstarVacio() {
		
		int[] a = new int[]{}, b = new int[]{1};
		int[] c = m.mezclar(a, b);
		
		assertArrayEquals("Primer arreglo vacío resulta en el segundo arreglo", new int[]{1}, c);
		
	}
	
}
