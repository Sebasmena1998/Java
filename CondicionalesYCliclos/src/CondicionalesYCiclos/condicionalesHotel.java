package CondicionalesYCiclos;

import java.util.Scanner;

public class condicionalesHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//1er Requerimento: Servicios Adicionales
	System.out.println("Servicios adicionales");
	
	System.out.println("Usted solicito Servicios adicionales? 1.- Si escriba true 2.- No, escriba false"); //Se pregunta si hubo usos de servicios adicionales
	
	Scanner solicitud = new Scanner(System.in);
		
		
		boolean serviciosAdicionales = solicitud.nextBoolean();
		
		if(serviciosAdicionales) { //Si hay servicios se le hara el cargo de lo que ocupo a su cuenta
			System.out.println("Usted solicito Servicios Adicionales, se le hara un cargo extra");
			
			
		}else { //Como no ocupo 
			System.out.println("Usted NO solicito Servicios Adicionales");

		}
	
	
	

	//2do Requerimento Temporada
	System.out.println();
	
	

	//3ro Requerimento	Horario (Check-in y Check-out)
	System.out.println();
	

	//4to Requerimento	
	System.out.println();
	

	//5to Requerimento	
	System.out.println();
	
	
	
	
	solicitud.close();
	}

}
