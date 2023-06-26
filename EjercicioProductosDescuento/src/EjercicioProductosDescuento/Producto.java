package EjercicioProductosDescuento;

public class Producto {
	

	// 1.- Atributos
	String nombreProducto;
	float precioDelProducto;

	// Constructor par pasarlo a las subclases

	public Producto(String nombreProducto, float precioDelPreoducto) {
		this.nombreProducto = nombreProducto;
		this.precioDelProducto = precioDelPreoducto;
	}//Cierre constructor

	// Metodo para imprimir Datos
	public void imprimirDatosProductos() {

		System.out.println("Nombre del Producto: " + nombreProducto);
		System.out.println("Precio del producto: " + precioDelProducto);
	} //Cierre imprimir Datos

	// Constructor para aplicar descuento

	public float obtenerDescuento() {
		
		float porcentajeDescuento = 0.15f;
		
		float valorDescuento = porcentajeDescuento * precioDelProducto;
		
		return valorDescuento;
	} //Cierre de ObtenerDescuento 
	
	
	public float aplicarDescuento() {
		
		float valorDescuento = obtenerDescuento(); 

		float valorFinalProducto = precioDelProducto - valorDescuento;

		return valorFinalProducto;
	}//Cierre para aplicar descuento
	
	
	

}//Cierre clase producto