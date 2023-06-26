package test;

import ejercicioCuentaAhorro.CajaAhorros;
import ejercicioCuentaAhorro.PlazoFijo;

public class ClaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instancia #1 (cuentaAhorro)
		
		CajaAhorros instancia1 = new CajaAhorros("Felipe Maqueda"/*Titular*/, 1000f /*Cantidad*/);//Cuando no quiere polimorfear
	
		
		//instancia #2 (Plazo Fijo)
		PlazoFijo instancia2 = new PlazoFijo("Jesus Gonzalez"/*Titular*/, 2500.0f/*Cantidad*/, 12/*Plazo*/, 5.0/*Interes*/);
		
		//Mostrar información de las cuentas
		
		instancia1.imprimirDatosCajaAhorro();
		System.out.println();
		instancia2.mostrarInformacionPlazoFijo();
	
	
	}

}
