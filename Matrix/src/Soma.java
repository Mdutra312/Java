import java.util.Scanner;
public class Soma {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int j,i,a[][];
		a = new int[3][3];
		for (i=0;i<3;i++) {
			for(j=0;j<3;j++) {
			System.out.println("digite o n�mero da primeira linha:");
			a[0][0] = in.nextInt();
			a[i][j] = a[i][j] *2;
			System.out.println(a[0][2]+" ");
			}
		}
			for (i=0;i<3;i++) {
				for(j=0;j<3;j++) {
			System.out.println("digite o n�mero da segunda linha:");
			a[1][0] = in.nextInt();
			a[i][j] = a[1][j] *2;
			System.out.println(a[1][2]+" ");
				}
			}
			
			
			for (i=0;i<3;i++) {
				for(j=0;j<3;j++) {
			System.out.println("digite o n�mero da terceira linha:");
			a[2][0] = in.nextInt();
			a[i][j] = a[i][j] *2;
			System.out.println(a[2][2]+" ");
				}
			}
}		
	}
	
