package Colecciones;

//import java.util.Set; //papa
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.HashSet; //hijo
import java.util.List;
import java.util.Map;
import java.util.Set;


public class colecciones {

    public static void main(String[] args) {
        
        
        //Declarando mi primer arreglo de Java []
        //Primero el tipo de dato que voy a almacenar, le pongo los corchetes cuadrados, despues el nombre de mi arreglo y por ultimo instancio mi arreglo. Los datos que voy  guardar en este arreglo, van dentro de {}
        
        String[] listaCompras = new String[] {"leche", "pan", "frutas"};
        
        //Impresi[on de mi array
        System.out.println(listaCompras);

        
        //forEach para imprimir cada elemento de mi lista de compras
        
        //para nuestros datos del tipo String, que se almacenan en una variable temporal llamada ProductoTemporal, que se esta llenando de un arrelgo llamado listaCompras, vas a imprimir ese productoTemporal
        for(String productoTemporal : listaCompras) {
            System.out.println(productoTemporal);
        }
        
        
    
        //Declaro mi arreglo de habitaciones de un hotel
        String[] habitaciones = new String[10];
        
        //Inicializo o asigno valores a cada indice
        habitaciones[0] = "101";
        habitaciones[1] = "102";
        habitaciones[2] = "103";
        habitaciones[3] = "104";
        habitaciones[4] = "105";
        habitaciones[5] = "106";
        habitaciones[6] = "107";
        habitaciones[8] = "109";
        habitaciones[9] = "110";
      //habitaciones[10] = "111"; 
       
        //Si tratamos de acceder a un elemento mas alla de los elementos declarados al principio, tendremos una excepcion que solo veremos cuando se ejecute el programa/
        
        
        //Cuando imprimimos un elemento que no esta definido dentro del arreglo, veremos un null. Esto pasa porque para JAVA es preferible tener un elemento nulo a uno indefinido. 
        System.out.println(habitaciones[8]);
        
        
        //En caso de querer usar un foreach para imprimir los elementos, solo se imprimiran 7 elementos. (solo itera sobre los elementos existentes).
        
        for(String habitacionTemporal : habitaciones) {
            System.out.println(habitacionTemporal);
        }//for
        
        
        //Arraylist  para una lista de contactos
        
        
        //Uso la interfase List que almacena Contactos (objeto), se llama lista de contacto e instancia un ArrayList para manejar los mismos tipos de datos (Contacto)
        List<Cliente> listaDeClientes = new ArrayList<>();
        
       //Primero instancio un objeto de la clase cliente (nombre, cuenta, saldo, nip)
        Cliente Felipe = new Cliente("Felipe Maqueda", "ABC123456",156.50f , "1234");
        
        //Agrego el cliente a mi lista de clientes con el metodo .add
        listaDeClientes.add(Felipe);
        
        
        listaDeClientes.add(new Cliente("Naruto", "Konoha1234", 0.0f, "4321"));
        
        
        System.out.println("Lsita Completa");
        //imprimo la informacion de mi lista(utilizo metodos)
        System.out.println(listaDeClientes );
        
        System.out.println();
        
        //Sacar un elemento de la lista y asignarlo a una variable
        System.out.println("Elemento en el indice 0");
        Cliente datoDeLista = listaDeClientes.get(0);
        
        System.out.println();
        
        //Imprimir el elemento de la lista con datos especificos
        System.out.println("Impresion de un elemento de la lista");
        System.out.println(datoDeLista );
        
        System.out.println();
        
        //eliminar elementos de la lista
        listaDeClientes.remove(0);
        
        System.out.println();
        
      //imprimo la informacion de mi lista(utilizo metodos)
        System.out.println(listaDeClientes);
        
      //Conjunto para servicios de un Hotel
        
        Set<String> roomService = new HashSet<>();
        
      //Agregamos  elementos a nuestro HashSet
        
        roomService.add("Chilaquiles");
        roomService.add("Agua Mineral");
        roomService.add("Wi-fi");
        
      //Hotel con promocion
        if (roomService.contains("Agua Mineral")) {
        	
        	System.out.println("Obtienes un descuento del 50%");
		}
        
        //Que pasa si imprimo mi roomService
        
        
        
        //Borramos todo mi roomService
        
        //roomService.clear();
        
        System.out.println(roomService);
        
        
        //HashMap para mi sistema de reservas del hotel
        
        Map<String, Cliente> reservaHabitacion = new HashMap<>();
        
        reservaHabitacion.put("101", new Cliente("Jesus", "135JJJ", 1890.87f, "0011"));
        
        reservaHabitacion.put("102", new Cliente("Bugs Bunny", "BGSB12", 1929.83f, "7777"));
        
        
        //Impresion de una reserva
        Cliente reservaBugsBunny = reservaHabitacion.get("102");//Obtener un dato del HashMap(key)
        
        
    }//main

}//colecciones


/*

Colecciones


- Arrays

Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:

    1. Tamanio fijo.
    2. Acceso rapido.
    3. Coste elevado para insertar o eliminar elementos. 
    
    
    
 - Set 
 
 Es una estructura de datos que almacenan elementos unicos sin orden especifico. Las primeras caracteristicas de un set son:
 
 	1.- No hay elementos duplicados
 	2.- No hay orden especificos
 	3.- Busqueda es más rapida (key-value)

  - HashMap
  
 Es una implementacion de la interfaz de Map de Java, que permite la informacion se almacene en pares clave-valor. Sus principales caracteristicas son:
 
 		1.- Almacenamiento K y V
 		2.- Sin orden especifico
 		3.- Busqueda Rapida
 		4.- Iteracion rapida (for each)
 		5.- No sincronizado (hilos)
 		
 

*/