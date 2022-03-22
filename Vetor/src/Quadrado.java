import java.util.Scanner;
public class Quadrado {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int m,i,a[],b[],tam=5,tam2=2;
	a = new int[tam];
	b = new int[tam];
	for (i=0; i<tam; i++) {
		System.out.println("Digite o número:");
		a[i] = in.nextInt();
	}
	for (i=0; i<tam; i++){
		b[i] = a[i]*a[i];
		System.out.print(b[i]+",");
	}
	
	
	
  }
}
