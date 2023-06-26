package Colecciones;

import java.util.Set;
import java.io.StreamCorruptedException;
import java.util.HashSet;

/*

Colecciones


- Arrays

Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:

    1. Tamanio fijo.
    2. Acceso rapido.
    3. Coste elevado para insertar o eliminar elementos. 



*/

public class colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> cartasDeJuego = new HashSet<>();

		// Declarando mi primer arreglo de java[]
		// Primero el tipo de dato que voy a almacenar, le pongo los corchetes
		// cuadrados, despues el nombre de mi arreglo y por ultimo instancio mi arreglo.

		String[] listaCompras = new String[] { "leche", "pan", "frutas" };

		System.out.println(listaCompras);

		// forEach para imprimir cada elemento de mi lista de compras

		for (String productoTemporal : listaCompras) {
			System.out.println(productoTemporal);
		}

		// Declaro mi arreglo de habitaciones de un hotel

		String[] habitaciones = new String[10];

		// Inicializo o asigno valores a cada indice

		habitaciones[0] = "101";
		habitaciones[1] = "102";
		habitaciones[2] = "103";
		habitaciones[3] = "104";
		habitaciones[4] = "105";
		habitaciones[5] = "106";
		habitaciones[6] = "107";
		habitaciones[7] = "108";
		habitaciones[8] = "109";
		habitaciones[9] = "110";

		// habitaciones[10] = "111"; Si tratamos de acceder a un elemento más alla de los elementos declarados al principio tendremos una excepcion que solo veremos cuando se ejecute el programa

		
	// Cuando imprimimos un elemento que no esta definido dentro del arreglo, veremos un null. Esto pasa porque para Java es preferible tener un elemento nulo a uno no definido.
			String habitacion = habitaciones[8];

			//En caso de querer usar un foreach para imprimir los elementos, solo se imprimiran 7 elementos (Solo itera sobre elementos existentes).
			
	
	}

}
