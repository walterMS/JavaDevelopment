// Autor Walter MS
import java.util.*;

public class karyStrings {
	private static int num=1;

	public static void main(String[] args) {
		int n=5;
		int k=6;//k values 0..k-1
		int[] arreglo = new int[n];
		System.out.println("\n");

		karyStrings(arreglo,arreglo.length,k);
	}

	static void karyStrings(int[] arreglo,int size, int k){
		if(size<=0){
			System.out.print("Cadena " + num++ + " : ");
			System.out.println(Arrays.toString(arreglo));
			return;
		}

		for (int i=0;i<k;i++) {
			arreglo[size-1]=i;
			karyStrings(arreglo,size-1,k);
		}
		
		
	}
}