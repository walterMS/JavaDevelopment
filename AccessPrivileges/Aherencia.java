package prueba.clases.a;
public class Aherencia extends A{
	
	A a = new A();


	public Aherencia (){
		super();
		System.out.println("Soy el constructor de la clase Aherencia");
		
	}

	public void accederA(){
		System.out.println("Accediendo a A desde Aherencia");
		System.out.println("Numero en A: " + a.getNumero());
		a.setNumero(47);
		System.out.println("Numero en A: " + a.getNumero());	
		System.out.println("Creados en A: " + a.getCreados());
	}


}