//Autor: Walter MS
public class Recursiva{

	public static void main(String[] args) {
		
		System.out.println("\n\n");

		for(int i=0; i<=20;i++){
			System.out.print("Factorial de " + i + "  ");
			System.out.println(Recursiva.factorial(new Long(i)));
		}
	}

	static Long factorial(Long n){

		if( n<=1){
			return n;
		}else{
			return n*factorial(n-1);
		}//else
	}//metodo
}//class
