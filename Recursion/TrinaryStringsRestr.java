// Autor Walter MS
import java.util.*;

public class TrinaryStringsRestr {
	private static int num=1;

	public static void main(String[] args) {
		int n=7;
		int[] arreglo = new int[n];
		System.out.println("\n");

		trinaryStringsRestr(arreglo,arreglo.length);
	}

	static void trinaryStringsRestr(int[] arreglo,int size){
		if(size<=0){
			System.out.print("Cadena " + num++ + " : ");
			System.out.println(Arrays.toString(arreglo));
			return;
		}

		if((size-1)!=(arreglo.length-1)){
			arreglo[size-1]=1;
			trinaryStringsRestr(arreglo,size-1);
		}
		
		if((size-1)!=(arreglo.length-1)){
			arreglo[size-1]=3;
			trinaryStringsRestr(arreglo,size-1);
		}
		
		if((size-1)!=(0) && (size-1)!=(5)){
			arreglo[size-1]=7;
			trinaryStringsRestr(arreglo,size-1);
		}
		
	}
}