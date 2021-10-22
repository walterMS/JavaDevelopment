package prueba.clases.a;
public class Adosherencia extends Ados{
	
	Ados a = new Ados();


	public Adosherencia (){
		super();
		System.out.println("Soy el constructor de la clase Adosherencia");
		
	}

	public void accederA(){
		System.out.println("Accediendo a A2 desde Adosherencia");
		System.out.println("Numero en A2: " + a.getNumero());
		a.setNumero(4799);
		System.out.println("Numero en A2: " + a.getNumero());	
		System.out.println("Creados en A2: " + a.getCreados());
	}

	public void setNumero(int numero){
		super.setNumero(numero);
	} 

	public int getNumero(){
		return super.getNumero();
	}

	public int getCreados(){
		return super.getCreados();
	}


}