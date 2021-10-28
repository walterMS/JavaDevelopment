// Autor Walter MS
import java.util.*;

public class BinaryStrings {
	private static int num=1;

	public static void main(String[] args) {
		int n=10;
		int[] arreglo = new int[n];
		System.out.println("\n");

		binaryStrings(arreglo,arreglo.length);
	}

	static void binaryStrings(int[] arreglo,int size){
		if(size<=0){
			System.out.print("Cadena " + num++ + " : ");
			System.out.println(Arrays.toString(arreglo));
			return;
		}
		arreglo[size-1]=0;
		binaryStrings(arreglo,size-1);
		arreglo[size-1]=1;
		binaryStrings(arreglo,size-1);
	}
}