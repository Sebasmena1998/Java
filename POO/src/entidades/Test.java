package entidades;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado EvilFelipe = new Empleado("Evil Felipe", 31, "evilfelipe@mail.com", "5511223344", "ABC123",
				"90876567389", "Bell Boy");

		EvilFelipe.mostrarInformacion();
		
		//Instancia de una persona
		Persona Naruto = new Persona("Naruto", 30, "naruto@gmail.com", "5533445566");
		Naruto.mostrarInformacion();
		
		System.out.println("Impresion de Objetos");
		System.out.println(EvilFelipe);
	
		
		System.out.println(Naruto.toString());
		
		
		//Instancia de un cliente 
		System.out.println("---------Nuevo Ejercicio--------");
		System.out.println();
		System.out.println("Instancia de un cliente");
		
		cliente Jesus = new cliente("Jesus Gonzales", "ABCD1234", 157654.00f , "1234");
		Jesus.mostrarInfo();
		System.out.println();
		
		//Modificacion de un atributo;
		
		Jesus.nombre = "Evil Jesus";
		Jesus.setCuentaBancaria("XYZ098");
		
		//Acceder a informacion privada
		//System.out.println(Jesus.saldo);
		
		//Acceder a informacion privada con getter
		System.out.println(Jesus.getCuentaBancaria());
		
		//Impresion del objeto ya modificado
		
		Jesus.mostrarInfo();
	}

}
