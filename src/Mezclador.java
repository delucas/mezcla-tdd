
public class Mezclador {

	public int[] mezclar(int[] a, int[] b) {
		int[] c = null;
		if (a.length > 0 && b.length > 0) {
			
			c = new int[a.length + b.length];
			
			for (int i = 0; i < a.length; i++) {
				c[i] = a[i];
			}
			for (int i = 0; i < b.length; i++) {
				c[a.length + i] = b[i];
			}
		}
		if (b.length == 0) {
			c = a;
		}
		if (a.length == 0) {
			c = b;
		}
		return c;
	}

}
