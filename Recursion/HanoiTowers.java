/*autor Walter MS*/

public class HanoiTowers{
        private static int num=1;
        
	public static void main(String[] args) {
		System.out.println("Towers Hanoi\n");

		 for(int i=1;i<=10;i++){
		 	System.out.println("Disks: " + i);
		 	hanoi('A','B','C',i);
                        System.out.println("\n\n");
                        num=1;
		 }		
	}

	static void hanoi(char org,char dest,char aux,int disks){
		if(disks==1){
			System.out.println( "Movimiento "+ num++ +" Mover de " + org + " a " + dest);
                        return;
		}
		hanoi(org,aux,dest,disks-1);
		System.out.println("Movimiento "+ num++ + " Mover de " + org + " a " + dest);
		hanoi(aux,dest,org,disks-1);
	}
}
