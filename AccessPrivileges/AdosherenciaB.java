package prueba.clases.b;
import prueba.clases.a.Ados;
class AdosherenciaB extends Ados{
	
	// Ados a = new Ados();


	public AdosherenciaB (){
		super();
		System.out.println("Soy el constructor de la clase AdosherenciaB");
		
	}

	public void accederAdos(){
		System.out.println("Accediendo a A2 desde Adosherencia");
		System.out.println("Numero en A2: " + this.getNumero());
		this.setNumero(784);
		System.out.println("Numero en this2: " + this.getNumero());	
		System.out.println("Crethisdos en this2: " + this.getCreados());
	}


}