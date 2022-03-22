import java.util.Scanner;
public class Susbstituição {
	public static void main(String[] args) {
		int i, tam=5,a[],b[];
	a = new int[tam];
	b = new int[tam];
		Scanner in = new Scanner(System.in);
	for (i=0; i<tam; i++ ) {
		a[i] = in.nextInt();
	}
	for (i=0; i<tam; i++) {
		b[0] = a[4];
		b[1] = a[3];
		b[2] = a[2];
		b[3] = a[1];
		b[4] = a[0];
		System.out.print(b[i]);
	}
		
		
	}
}
