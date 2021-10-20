package prueba.clases.a;
class A{
	
	private int numero;
	private int creados;

	public A (){
		System.out.println("Soy el constructor de la clase A");
		this.modificarNumero();
	}

	void setNumero(int numero){
		this.numero = numero;
	}

	int getNumero(){
		return this.numero;
	}

	private void modificarNumero(){
		this.numero +=2;
		this.creados++;
	}

	int getCreados(){
		return this.creados;
	}
