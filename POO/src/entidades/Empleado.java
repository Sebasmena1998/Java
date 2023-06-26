
package entidades;

//Primero dar la instrucciónde que quiero heredar
public class Empleado extends Persona {

	// 1.- Atributos o propiedades
	public String numEmpleado;
	public String nss;
	public String puesto;

	// 2.- Constructor con parametros
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono);// con la palabra Super, evitamos repetir los .this
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}

	// Heredar constructore sobrecargado
	

	// 3. Metodo para imprimirInformacion empleado
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Correo: " + correo);
		System.out.println("Telefono: " + telefono);
		System.out.println("Numero Empleado: " + numEmpleado);
		System.out.println("Numero Seguro Social: " + nss);
		System.out.println("Puesto: " + puesto);
		System.out.println("------Siguiente Persona------");
	}// cierre mostrarInformacin
	
	
    //4. toString
    //toString es un metodo en Java que proviene de la clase Objeto (el antecesor o precursor de todos los objetos que existen en Java). Este metodo ya se escribio, ya esta definido y nos permite mostrar la informacion del objeto en una cadena de texto. 
    
    @Override
    public String toString() {
        return "Empleado [numEmpleado=" + numEmpleado + ", nss=" + nss + ", puesto=" + puesto + ", nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + ", telefono=" + telefono + "]";
    }
}





