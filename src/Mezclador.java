public class Mezclador {

	public int[] mezclar(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];

		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {

			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}

		}
		for (; i < a.length; i++) {
			c[k] = a[i];
		}
		for (; j < b.length; j++) {
			c[k] = b[j];
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
