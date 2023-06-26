package EjercicioProductosDescuento;

	public class Consumidor extends Producto{
		
		//1.- Atributos
		
		public String nombreConsumidor;
		public int edadConsumidor;
			
		//1.- Metodo para consumidor
		
		public Consumidor(String nombreProducto, float precioDelPreoducto, String nombreConsumidor, int edadConsumidor) {
			super(nombreProducto, precioDelPreoducto);
			this.nombreConsumidor = nombreConsumidor;
			this.edadConsumidor = edadConsumidor;
		}
	

	
	public void mostrarInfoConsumidor() {
		
		System.out.println("El nombre del consumidor es: " + nombreConsumidor);
		System.out.println("La edad del consumidor es: " + edadConsumidor);
		imprimirDatosProductos();
		System.out.println("El descuento seria de " + obtenerDescuento());
		System.out.println("El valor final del producto es de: " + aplicarDescuento());
		
		
		
	
		
		
	}

		

}
