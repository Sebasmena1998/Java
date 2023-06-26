package Animal;

public class testAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos un animal, en este momento usamos el metodo que imprime "Hacer sonido", y cuando definimos que este animal es un gato, se sobreescribe el metodo y se cambia por "miau miau".
		
		Animal Garfield = new Gato ();
		Garfield.hacerSonido();
		
		Animal Odie = new Perro();
		Odie.hacerSonido();
		
		Animal Godzilla = new Animal();
		Godzilla.hacerSonido();
	}

}
