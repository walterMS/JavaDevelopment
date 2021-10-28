// Autor Walter MS
import java.util.*;

public class BinaryStringsRestr {
	private static int num=1;

	public static void main(String[] args) {
		int n=10;
		int[] arreglo = new int[n];
		System.out.println("\n");

		binaryStringsRestr(arreglo,arreglo.length);
	}

	static void binaryStringsRestr(int[] arreglo,int size){
		if(size<=0){
			System.out.print("Cadena " + num++ + " : ");
			System.out.println(Arrays.toString(arreglo));
			return;
		}
		if((size-1)!=(arreglo.length-1)){
			arreglo[size-1]=0;
			binaryStringsRestr(arreglo,size-1);
		}
		
		if((size-1)!=(3) && (size-1)!=(0) ){
			arreglo[size-1]=1;
			binaryStringsRestr(arreglo,size-1);
		}
		
	}
}