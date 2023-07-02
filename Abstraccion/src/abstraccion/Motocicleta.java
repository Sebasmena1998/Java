package abstraccion;

public class Motocicleta extends Vehiculo {
	
	
	@Override
	
	public void acelerar() {
		
		System.out.println("La motocicleta esta acelerando...");
	
	}

	//la subclase es quien decide cuando y como se sobrescribe el metodo abstracto. Es decir, la clase implementa el metodo.
	
	
	@Override
	public void frenar() {
		
		System.out.println("La motocicleta esta frenando...");
		
	}	
	

}
