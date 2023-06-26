package ejercicioCuentaAhorro;

public class Cuenta {

		//1.- Atributos
		String titular;
		float cantidad;
		
		//Constructor para pasarlo a las subclases (desde click izquierdo source)
		public Cuenta(String titular, float cantidad) {
			this.titular = titular;
			this.cantidad = cantidad;
		}//Cierre del constructor
		
		//2.- Metodo para imprimir datos
		
		public void imprimirDatosCuenta() {
			System.out.println("Titular: " + titular);
			System.out.println("Cantidad: " + cantidad);
			System.out.println("Esto es de la cuenta");
		}//Cierre de imprimir Datos

		
		
}//Cierre Clase Cuenta
