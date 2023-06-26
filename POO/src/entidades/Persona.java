/*
 * Herencia en la POO
 * 
 * Nos permite heredar atributos y metodos con la finalidad de reutilizar codigo y generar una relacion entre clases superiores (padres) y las subclases (hijos).
 * 
 * Superclase (clase superior) es la clase de quien vamos a heredar (persona)
 * Sublcase (clase hijo) es donde vamos a poner lo que heredamos (empleado)
 * 
 * 
 * Para heredar, usamos una palabra reservada llamada extends. Esta palabra se coloca al alado del nombre de mi clase (Empleado), y despues definimos el lugar de donde nos vamos a traer las cosas que queremos heredar (Persona).
 * 
 * 
 * 
 * Para heredar constructores de una forma muy rapida, daremos click derecho sobre nuestro editor de codigo, despues buscaremos la opcion source y despues en la opcion de Generate Constructor using fields. En la segunda ventana, veremos la cantidad de constructores disponibles para heredar.
 * 
 * 
 */





package entidades;

public class Persona {

	// 1. Propiedades o atributos

	public String nombre;
	public int edad;
	public String correo;
	public String telefono;

	// Cierrre de propiedades

	// 2. Constructor

	public Persona(String nombre, int edad, String correo, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
	}// Cierre de constructor

	public Persona(String nombre, int edad, String correo) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}// Cierre de constructor

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}// Cierre de constructor

	
	
	// 3. Metodos

	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Correo: " + correo);
		System.out.println("Telefono: " + telefono);
		System.out.println("------Siguiente Persona------");
	} // Cierre de información

	// Metodo main es una function
	public static void main(String[] args) {

		// Instancia de un objeto Persona;
		Persona Felipe = new Persona("Felipe", 31, "felipe.maqueda@idr.edu.mx", "5512345678");
		Persona Sebas = new Persona("Sebas", 25, "sebas.mendoza@idr.edu.mx", "5587654321");
		Persona Ceci = new Persona("Ceci", 24, "ceci.canedo@idr.edu.mx", "5513579246");
		Persona Vane = new Persona("Vane", 25, "vane.cuevas@idr.edu.mx", "5597531246");
		Persona Dani = new Persona("Dani", 26, "dani.hernandez@idr.edu.mx", "5524680864");
		Persona Rodri = new Persona("Rodri", 24, "rodi.juarez@idr.edu.mx", "5514577905");

		Felipe.mostrarInformacion();
		Sebas.mostrarInformacion();
		Ceci.mostrarInformacion();
		Vane.mostrarInformacion();
		Dani.mostrarInformacion();
		Rodri.mostrarInformacion();

	}

}
