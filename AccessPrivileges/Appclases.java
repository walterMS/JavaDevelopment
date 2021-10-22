package prueba.clases;
// import prueba.clases.a.A;
import prueba.clases.a.Ados;
class Appclases{

	public static void main(String[] args) {
		
		System.out.println("App en clases usando clase A y A2\n");

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
		// System.out.println("Acceder A en ados desde Appclases: " );
		ados.accederA();


	}
}