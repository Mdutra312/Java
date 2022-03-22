import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		int a[],i,tam=5,a1,a2,a3,a4,a5;
		a = new int[tam];
		Scanner in = new Scanner(System.in);
		for (i=0; i<tam; i++) {
		System.out.println("Digite seu número:");
		a[i] = in.nextInt();
		}
		System.out.println("Segue a tabuada do primeiro número digitado:");
		for (i=0; i<11; i++) {
			a1 = a[0]*i;
			System.out.println(a1);
		}
		System.out.println("Segue a tabuada do segundo número digitado:");
		for (i=0; i<11; i++) {
			a2 = a[1]*i;
			System.out.println(a2);
			
		}
		System.out.println("Segue a tabuada do terceiro número digitado:");
		for (i=0; i<11; i++) {
			a3 = a[2]*i;
			System.out.println(a3);
			
		}
		System.out.println("Segue a tabuada do quarto número digitado:");
		for (i=0; i<11; i++) {
			a4 = a[3]*i;
			System.out.println(a4);
			
		}
		System.out.println("Segue a tabuada do quinto número digitado:");
		for (i=0; i<11; i++) {
			a5 = a[4]*i;
			System.out.println(a5);
		}
		
		
	}
}
