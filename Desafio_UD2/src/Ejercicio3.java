
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un programa en Java que muestre y cuente los números que son múltiplos de 2 o de 3 que hay entre 1 y 100.
		//Utiliza las estructuras de control que creas convenientes.
		int contador_multiplos2 = 0;
		int contador_multiplos3 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2 ==0) {
				System.out.println("El número " + i + " es múltiplo de 2");
				contador_multiplos2++;
			}
			if (i%3 ==0) {
				System.out.println("El número " + i + " es múltiplo de 3");
				contador_multiplos3++;
			}
		}
		System.out.println("Hay " + contador_multiplos2 + " números múltiplos de 2");
		System.out.println("Hay " + contador_multiplos3 + " números múltiplos de 3");
	}

}
