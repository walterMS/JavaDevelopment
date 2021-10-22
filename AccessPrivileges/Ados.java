package prueba.clases.a;
public class Ados{
	
	private int numero;
	private int creados;
	A a = new A();


	public Ados (){
		System.out.println("Soy el constructor de la clase A2");
		this.modificarNumero();
	}

	protected void setNumero(int numero){
		this.numero = numero;
		this.creados=35;
	} 

	protected int getNumero(){
		return this.numero;
	}

	private void modificarNumero(){
		this.numero +=10;
	}

	protected int getCreados(){
		return this.creados;
	}

	public void accederA(){
		System.out.println(a.getNumero());
		System.out.println(a.getCreados());
		a.setNumero(30);
		System.out.println(a.getNumero());
		//System.out.println(a.modificarNumero());
	}


}