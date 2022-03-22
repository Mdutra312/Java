import java.util.Scanner;
public class Dobro {
 public static void main(String[] args) {
	Scanner in = new Scanner (System.in); 
		int a[][], i, j;
		a = new int[1][3];
		System.out.println("Digite o número:");
		a[0][0] = in.nextInt();
		System.out.println("Digite o número:");
		a[1][0] = in.nextInt();
		System.out.println("Digite o número:");
		a[2][0] = in.nextInt();
		for (i=0; i<2; i++) {
			System.out.println();
			for (j=0;j<3;j++) {
				a[i][j]=a[i][j]*2;
				System.out.print(a[i][j]+" ");
			}
		    }
		}
}
