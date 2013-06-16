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

	@Test
	public void queElSegundoArregloPuedeEstarVacio() {

		int[] a = new int[]{1}, b = new int[]{};
		int[] c = m.mezclar(a, b);

		assertArrayEquals("Segundo arreglo vacío resulta en el primer arreglo", new int[]{1}, c);

	}

	@Test
	public void queSePuedenUnirDosArreglos() {

		int[] a = new int[]{1}, b = new int[]{2};
		int[] c = m.mezclar(a, b);

		assertArrayEquals("Al unir dos arreglos resulta en un arreglo con todos los elementos", new int[]{1, 2}, c);

	}

	@Test
	public void queSePuedenUnirDosArreglosDesiguales() {

		int[] a = new int[]{1, 2}, b = new int[]{3};
		int[] c = m.mezclar(a, b);

		assertArrayEquals("Al unir dos arreglos resulta en un arreglo con todos los elementos", new int[]{1, 2, 3}, c);

	}

	@Test
	public void queSePuedenUnirDosArreglosDesigualesConElementosIntercalados() {

		int[] a = new int[]{1, 3}, b = new int[]{2};
		int[] c = m.mezclar(a, b);

		assertArrayEquals("Al unir dos arreglos resulta en un arreglo con todos los elementos intercalados", new int[]{1, 2, 3}, c);

	}

}
