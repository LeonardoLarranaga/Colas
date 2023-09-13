public class ColaCircular<T> {
	private T[] cola;
	private int MAX;
	private int inicio;
	private int fin;
	
	@SuppressWarnings("unchecked")
	public ColaCircular(int MAX) {
		this.cola = (T[]) new Object[MAX];
		this.MAX = MAX;
		this.inicio = -1;
		this.fin = -1;
	}
	
	public void insertar(T dato) {
		if ((fin == MAX && inicio == 1) || (fin + 1) == inicio) {
			System.out.println("Desbordamiento");
		} else {
			if (fin == MAX) {
				fin = 0;
			} else {
				fin += 1;				
			}
			
			cola[fin] = dato;
			
			if (inicio == -1) inicio = 0;
		}
	}
	
	public T eliminar() {
		if (inicio == -1) {
			System.out.println("Desbordamiento");
			return null;
		} else {
			T dato = cola[inicio];
			
			if (inicio == fin) {
				inicio = fin = -1;
			} else {
				if (inicio == MAX - 1) {
					inicio = 0;
				} else {
					inicio += 1;
				}
			}
			
			return dato;
		}
	}
}
