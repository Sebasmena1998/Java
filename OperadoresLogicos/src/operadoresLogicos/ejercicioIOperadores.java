package operadoresLogicos;

public class ejercicioIOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Los operadores lógicos se utilizan para combinar valores booleanos y nos
		 * devuelven
		 */

		// && and (Y)
		// || or (O)
		// ! not (no)

		int a = 5;
		int b = 3;

		System.out.println(a == b || a > b);
		System.out.println(!(a == b) && a < b);

		System.out.println("-------Ejercicio Numero pares--------");

		int num = 10;
	
		boolean resultado = (num % 2 == 0);

		if (resultado) {
			System.out.println("El numero es par");

		} else {
			System.out.println("El numero es impar");
		}

	
	
	
/* Condicional switch */
		
		int opcion = 1;
		
		switch (opcion) {

		case 1:
			System.out.println("Bienvenido al servicio de reservas");
			//funcionReservas();
			break;

		case 2:
			System.out.println("Bienvenido al servicio de check-in");
			//funcionReservas();
			break;

		case 3:
			System.out.println("Bienvenido al servicio de check-out");
			//funcionReservas();
			break;

		default:
			System.out.println("Opcion invalida");

		} //cierre del switch
	}

}
