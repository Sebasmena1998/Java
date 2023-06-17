package tipoDeDatosYVariables;

public class ejercicioDatosYVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Hola mundo");
		//Tipos de datos
			
			//byte: sirve para representar un valor numérico de 8 bits
			//Cine Java
			byte salas = 10;
			System.out.println(salas);
			
			//short: sirve para reprersentar un valor numerico de 16 bits
			short asientos = 1120;
			System.out.println(asientos);
			
			//int: sirve para almacenar un valor numérico de 32 bits
			int dulces = 3476;
			System.out.println(dulces);
			
			//long: sirve para representar un valor numerico 
			long clientes = 313600;
			System.out.println(clientes);
			
			//Datos que pueden tener punto decimal:
			
			//float: Sirve para almacenar un valor numérico de 23 bits
			float palomitas = 35.5f;
			System.out.println(palomitas);
			
			//double: Sirve para almacenar un valor numérico de 64 bits
			double ganancia = 23770880.7d;
			System.out.println(ganancia);
			
			//boolean sirve pra representar valores booleanos y solamente tiene dos salidas, verdadero o falso
			//char sirve para representar un caracter o un numero (pero solamente uno)
			
			//casting o casteo sirve para realizar una conversion de tipos de daatos a uno mas grande o pequeño, incluso
			
			
			double num = 59.70d;
				//casteo a entero
			int numInt = (int) num;
			System.out.println("double" + numInt);
			
			long numlong = (long) num;
			System.out.println("long" + numlong);
			
			String cantidad = "85";
			String precio = "59.7";
			
			
			int cantEntero = Integer.parseInt(cantidad);
			double precioDouble = Double.parseDouble(precio);
			System.out.println("El valor de la compra es: " + (cantEntero * precioDouble));
			
			
			//operadores aritmeticos
			
			int dias = 28;
			dias = dias / 2;
			System.out.println("dias: " + dias);
			
			//operadores de incremento y decremento
			
			int p = 0;
			p++;
			p++;
			p++;
			System.out.println(p);
			
			/*Operadores relacionales
			== compara si un operando es igual a otro
			!0 diferente a
			<menor que
			>mayor que
			<=menor o igual
			>= mayor o igual    */
			
			int a = 10;
			int b = 15;
			boolean resultado;
			resultado = a == b;
			System.out.println("El resultado de la operacion es: " + resultado);
			
			
		}

	}
