package ejercicioCuentaAhorro;

public class CajaAhorros extends Cuenta{

	//2.-  Metodos (heredar cuenta)
	public CajaAhorros(String titular, float cantidad) {
		super(titular, cantidad);
		// TODO Auto-generated constructor stub
	}

	public void imprimirDatosCajaAhorro() {
		System.out.println("Titular: " + titular);
		System.out.println("Cantidad: " + cantidad);
		imprimirDatosCuenta();
	}//Cierre de imprimir Datos

	
	//toString
	@Override
	public String toString() {
		return "CajaAhorros [titular=" + titular + ", cantidad=" + cantidad + "]";
	}

	
	
	
	
}//Cierre de clase CajaAhorros
