package ejercicioCuentaAhorro;

	public class PlazoFijo extends CajaAhorros {

	// 1.- Atributos

	public int plazo;
	public double interes;

	// 2.- metodo para calcular el interes

	public PlazoFijo(String titular, float cantidad, int plazo, double interes) {
		super(titular, cantidad);
		this.plazo = plazo;
		this.interes = interes;
	}//Cierre PlazoFijo
		
		//3.- Metodo para obtener el interes
		
		public double obtenerImporteInteres() {
			return (cantidad*interes)/100;
	}//Cierre obtenerImporteInteres

		//4.- Metodo para mostrar informaion
public void mostrarInformacionPlazoFijo() {
	System.out.println("Informacion de la cuenta Plazo Fijo");
	imprimirDatosCajaAhorro();	
	System.out.println("Plazo: " + plazo);
	System.out.println("Interes: " + interes);
	System.out.println("Total de interes: " + obtenerImporteInteres());
}//Cierre mostrarInformacion


}//Cierre Clase
