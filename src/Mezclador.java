
public class Mezclador {

	public int[] mezclar(int[] a, int[] b) {
		int[] c = b;
		if (b.length == 0) {
			c = a;
		}
		return c;
	}

}
