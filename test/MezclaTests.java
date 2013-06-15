import static org.junit.Assert.*;
import org.junit.Test;


public class MezclaTests {

	@Test
	public void queSePuedeCrearUnMezclador() {
		
		Mezclador m = new Mezclador();
		
	}
	
	@Test
	public void queSePuedeMezclar() {
		
		Mezclador m = new Mezclador();
		int[] a = null, b = null;
		int[] c = m.mezclar(a, b);
		
	}
	
	@Test
	public void queSePuedenMezclarArreglosVacios() {
		
		Mezclador m = new Mezclador();
		int[] a = null, b = null;
		int[] c = m.mezclar(a, b);
		
		assertArrayEquals("Dos arreglos vacíos resultan en un arreglo vacío", new int[]{}, c);
		
	}
	
}
