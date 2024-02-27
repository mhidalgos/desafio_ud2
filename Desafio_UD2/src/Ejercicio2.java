import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribe un programa en Java que pida un número por teclado hasta que éste sea positivo. 
		//A continuación, muestra los primeros 20 números sucesivos a dicho número.
		int num, contador;
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println ("Introduce un número: ");
			num = sc.nextInt();
		}while (num<0);
		sc.close();
		contador = 1;
		while (contador<20) {
			System.out.println (num + contador);
			contador++;
		}
		
	
			
			
		
	}

}
