public class Cola<T> {
	private T[] cola;
	private int MAX;
	private int inicio;
	private int fin;

	@SuppressWarnings("unchecked")
	public Cola(int MAX) {
		this.cola = (T[]) new Object[MAX];
		this.MAX = MAX;
		inicio = -1;
		fin = -1;
	}

	public void insertar(T dato) {
		if (fin < MAX) {
			fin += 1;
			cola[fin] = dato;
			if (fin == 0) inicio = 0;
		} else {
			System.out.println("Desbordamiento");
		}
	}

	public T eliminar() {
		if (inicio != -1) {
			T dato = cola[inicio];

			if (inicio == fin) {
				inicio = fin = -1;
			} else {
				inicio += 1;
			}

			return dato;
		} else {
			System.out.println("Subdesbordamiento");
			return null;
		}
	}

	public int size() {
		if (inicio == -1) return 0;
		else return fin - inicio + 1;
	}
}