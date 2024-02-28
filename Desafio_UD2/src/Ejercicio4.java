import java.util.Scanner; 

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String forma;
		int aux;
		
		//Se pide al usuario los 3 números
		System.out.print ("Introduce el primer número: ");
		int num1 = sc.nextInt();
		System.out.print ("Introduce el segundo número: ");
		int num2 = sc.nextInt ();
		System.out.print("Introduce el tercer número: ");
		int num3 =sc.nextInt ();
		
		//ASC o DESC
		do {
			System.out.print("Selecciona la forma de ordenarlos: ascendente ´asc´o descendente ´desc´:");
			forma = sc.next();
		}while(!forma.equals("asc") && !forma.equals("desc"));
		
		//Si es Ascendente
		if(forma.equals("asc")) {
			if (num1 > num2) {
				aux = num1;
				num1 = num2;
				num2 = aux;
			}if (num2>num3) {
				aux = num2;
				num2 = num3;
				num3 = aux;
			}if (num1 > num2) {
				aux = num1;
				num1 = num2;
				num2 = aux;
			}
			System.out.print("Números ordenados de manera ascendente: " + num1  + num2 + num3);
		}
		
		//Si es Descendente
		if(forma.equals("desc")) {
			if (num1 < num2) {
				aux = num1;
				num1 = num2;
				num2 = aux;
			}if (num2 < num3) {
				aux = num2;
				num2 = num3;
				num3 = aux;
			}if (num1 < num2) {
				aux = num1;
				num1 = num2;
				num2 = aux;
			}
			System.out.print("Números ordenados de manera descendente: " + num1 + num2 + + num3 );
		}
		
		
		sc.close();
	}
	
}
