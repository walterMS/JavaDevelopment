package prueba.clases.a;
class Appadentro{

	public static void main(String[] args) {
		
		System.out.println("App adentro usando clase A y A2\n");

		A a = new A();
		Ados ados = new Ados();
		

		System.out.println("Numero en A: " + a.getNumero());
		a.setNumero(12);
		System.out.println("Numero en A: " + a.getNumero());	
		//a.modificarNumero();
		// System.out.println(a.numero);
		System.out.println("Creados en A: " + a.getCreados());

		System.out.println("Numero en ados: " + ados.getNumero());
		ados.setNumero(222);
		System.out.println("Numero en ados: " + ados.getNumero());	
		//ados.modificadosrNumero();
		// System.out.println(ados.numero);
		System.out.println("Creados en ados: " + ados.getCreados());
		System.out.println("Acceder A en ados: " );
		ados.accederA();

		System.out.println("######################" );
		Aherencia aherencia = new Aherencia();
		System.out.println("Acceder A en aherencia: " );
		aherencia.accederA();
		System.out.println("Numero en aherencia: " + aherencia.getNumero());
		aherencia.setNumero(55);
		System.out.println("Numero en aherencia: " + aherencia.getNumero());	
		System.out.println("Creaherencia en aherencia: " + aherencia.getCreados());


	}
}