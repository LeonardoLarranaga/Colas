public class Simulacion {
	public static void main(String[] args) {
		Cola<Orden> cola = new Cola<Orden>(10);
		
		cola.insertar(new Orden("Leo", 13));
		cola.insertar(new Orden("Juan", 4));
		cola.insertar(new Orden("Jose", 3));
		cola.insertar(new Orden("Esteban", 1));
		cola.insertar(new Orden("Alex", 8));
		cola.insertar(new Orden("Antonio", 20));
		
		System.out.println(cola.size());
		System.out.println(cola.eliminar());
		System.out.println(cola.size());
		System.out.println(cola.eliminar());
		System.out.println(cola.size());
	}
}
