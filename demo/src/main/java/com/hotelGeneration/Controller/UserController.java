package com.hotelGeneration.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hotelGeneration.Entity.User;


import com.hotelGeneration.Service.UserService;

/*
 * El controller es quien lleva todo el peso referente a las solicitudes HTTP (es el mesero de nuestro restaurante). Aqui sucede la manipulacion de los metodos HTTP (GET, POST, PUT, DELETE).
 * 
 * Para poder decirle a JAVA que esta clase es un controller, necesitamos usar la anotacion @RestController. Esto nos ayudara a poder manejar solicitudes HTTP, y ademas con esta anotacion podremos manejar el fetch que tengamos en nuestro front.
 */


@RequestMapping (params = "/hotelGeneration/User")
@RestController //Usamos esta anotación para decirle que es una API del tipo REST (que trabaja con métodos HTTP)
public class UserController {
	
	//Creo una instancia de la clase UserService para que el controlador sepa la informacion del servicio
	
	private final UserService userService;
	
	@Autowired
	
	
	//Creo un constructor para mi UserController, tomara como argumento la instancia del userService
	public UserController(UserService userService) {
		
		this.userService = userService;
	}// Constructor que utiliza la instancia del Service como parametro
	
	/*
     * Ya que mi Controller depende de mi Service (con la instancia de UserService dentro de UserController), podre establecer los metodos HTTP que disparan las operaciones del CRUD (Controller - Service)
     */
	
	//Metodo HTTP
	@GetMapping
	
	public List<User> readUsuarios(){
		return userService.readUsuarios();
	}
	
	
	
	


}
