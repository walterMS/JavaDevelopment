package prueba.clases.b;
// import prueba.clases.a.A;
import prueba.clases.a.Ados;
import prueba.clases.a.Adosherencia;
class AppB{

	public static void main(String[] args) {
		
		System.out.println("App en B usando clase A y A2\n");

		// A a = new A();
		Ados ados = new Ados();

		// System.out.println("Numero en A desde B: " + a.getNumero());
		// a.setNumero(12);
		// System.out.println("Numero en A desde B: " + a.getNumero());	
		// //a.modificarNumero();
		// // System.out.println(a.numero);
		// System.out.println("Creados en A desde B: " + a.getCreados());

		// System.out.println("Numero en ados desde B: " + ados.getNumero());
		// ados.setNumero(12);
		// System.out.println("Numero en ados desde B: " + ados.getNumero());	
		// //ados.modificadosrNumero();
		// // System.out.println(ados.numero);
		// System.out.println("Creados en ados desde B: " + ados.getCreados());
		// System.out.println("Acceder A en ados desde B: " );
		ados.accederA();

		System.out.println("######################" );	
		Adosherencia adosherencia = new Adosherencia();
		System.out.println("Acceder A en adosherencia: " );
		adosherencia.accederA();
		System.out.println("Numero en adosherencia: " + adosherencia.getNumero());
		adosherencia.setNumero(68);
		System.out.println("Numero en adosherencia: " + adosherencia.getNumero());	
		System.out.println("Creadosherencia en adosherencia: " + adosherencia.getCreados());

		System.out.println("\n\n######################" );	
		AdosherenciaB adosh2 = new AdosherenciaB();
		System.out.println("Acceder A en adosh22: " );
		adosh2.accederAdos();
		System.out.println("\nAcceder A en adosh2: " );
		adosh2.accederA();
		
		// System.out.println("Numero en adosh2: " + adosh2.getNumero());
		// adosh2.setNumero(111);
		// System.out.println("Numero en adosh2: " + adosh2.getNumero());	
		// System.out.println("Creadosh2 en adosh2: " + adosh2.getCreados());


	}
}