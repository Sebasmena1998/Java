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
