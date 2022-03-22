import java.util.Scanner;
public class teste {
 public static void main(String[] args) {
	Scanner in = new Scanner (System.in); 
		int a[][], i, j;
		a = new int[3][3];
		for (i=0; i<3; i++) {
			for (j=0;j<3;j++) {
				System.out.println("Digite o número: "+j+" linha: i");
				a[i][j] = in.nextInt();
			}
		}
		for (i=0;i<3;i++) {
			System.out.println();
		    for (j=0;j<3;j++) {
		    	System.out.print(a[i][j]+" ");
		    	
		    	
		    }
		}
}
}