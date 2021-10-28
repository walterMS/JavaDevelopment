// Autor Walter MS
import java.util.*;

public class TrinaryStrings {
	private static int num=1;

	public static void main(String[] args) {
		int n=5;
		int[] arreglo = new int[n];
		System.out.println("\n");

		trinaryStrings(arreglo,arreglo.length);
	}

	static void trinaryStrings(int[] arreglo,int size){
		if(size<=0){
			System.out.print("Cadena " + num++ + " : ");
			System.out.println(Arrays.toString(arreglo));
			return;
		}
		arreglo[size-1]=1;
		trinaryStrings(arreglo,size-1);
		arreglo[size-1]=3;
		trinaryStrings(arreglo,size-1);
		arreglo[size-1]=7;
		trinaryStrings(arreglo,size-1);
	}
}