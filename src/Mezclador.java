
public class Mezclador {

	public int[] mezclar(int[] a, int[] b) {
		int[] c = {1, 2};
		if (b.length == 0) {
			c = a;
		}
		if (a.length == 0) {
			c = b;
		}
		return c;
	}

}
