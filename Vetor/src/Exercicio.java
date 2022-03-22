import java.util.Scanner;

public class Exercicio{
public static void main (String[] args){
	int a[], i;
	a = new int[5];
	Scanner in = new Scanner(System.in);
	
	for (i=1; i<=5; i++){		System.out.print("Digite o valor de a: ");
       a[i] = in.nextInt();
	}
	for (i=1; i<=5; i++){
		System.out.print(a[i]);
	}
  }
}