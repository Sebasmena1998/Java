package CondicionalesYCiclos;

import java.util.Scanner;

public class CondicionalesYCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int edad = 31; // final es como declarar la variable constante y no se puede modificar

		System.out.println("La edad es: " + edad);

		/*
		 * 
		 * Condicionales
		 * 
		 * if else else if switch
		 */

		System.out.println("Programa para calcular la hora");

		// Java crea un objeto Scanner, llamalo hora y este sera un nuevo objeto de la
		// clase Scanner, que tiene los argumentos para guardar la información que le
		// pase como entrada

		Scanner valorIngresado = new Scanner(System.in); // declaro objeto y le paso info
		System.out.println("Por favor, ingresa la hora en un formato de 24 horas");

		// var valor ingresado = prompt("mensaje"); en una sola linea (declaro variable,
		// asigno el prompt, y la info del promt la guardo en esa variable

		int hora = valorIngresado.nextInt(); // Usar la información del objeto

//		int hora = 13;

		if (hora >= 0 && hora <= 24) { // es una hora valida
			System.out.println("Es una hora valida");

			if (hora >= 7 && hora <= 11) {

				System.out.println("Buenos días solecito");
			} else if (hora >= 12 && hora <= 19) {
				System.out.println("Buenas tardes, ta juerte la carlors");

			} else if (hora >= 19 && hora <= 24) {
				System.out.println("Hora de ir a mimir");
			} else {
				System.out.println("Ni los gallos estan despiertos aún");
			}

		} else {
			System.out.println("Hora mal ingresada");
		}

	}

}
