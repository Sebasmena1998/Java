package com.hotelGeneration.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;//importacion de la libreria de Spring

import com.hotelGeneration.Entity.User;

/*
 * Recuerda que la capa de servicios, se encarga de definir la logica de negocios del lado de java (aqui es donde vamos a definir los metodos enfocados a las operaciones del CRUD que seran "disparados" por los metodos HTTP que se encontraran en el controller.
 */

//Anotaciones son instrucciones que le damos a JAVA para que sepa hacer algo (@Test, @Overdrive)

@Service // Usamos la anotacion @Service para decirle a JAVA que esta clase es de un servicio
public class UserService {
	
	//Emular  una pequenia base de datos usando un ArrayList
	
	public ArrayList<User> listaDeUsuarios = new ArrayList <User>(); //Declarar una lista vacia
	
	public UserService() {
		
		//Instancia de las personas
		listaDeUsuarios.add(new User ("Felipe", "maqueda", "felipe@mail.com", "5512345678"));
		listaDeUsuarios.add(new User ("Mariana", "Valladolid", "mariana@mail.com", "5587654321"));
		listaDeUsuarios.add(new User ("Naruto", "Uzumaki", "naruto@mail.com", "5513579246"));
		listaDeUsuarios.add(new User ("Sasuke", "Uchiha", "felipe@mail.com", "5524680135"));
	}
	
	//Metodos CRUD para poder iterar sobre usuarios
	
	// Metodo para agregar usuario
	public List<User> getUsuarios(){
		return listaDeUsuarios;
	}


	//Metodo para leer usuario
	
	// Metodo para modificar usuario

	//Metodo para borrar usuario

	

}
