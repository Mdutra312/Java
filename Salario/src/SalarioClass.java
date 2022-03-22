import java.util.Scanner;
public class SalarioClass {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int sal, salminimo, r;
		System.out.println("DIgite seu salário:");
		sal = in.nextInt();
		System.out.println("Digite o salário mínimo:");
		salminimo = in.nextInt();
		if (sal<salminimo){
			r = salminimo-sal;
		System.out.println("Seu salário está fora da lei");
		System.out.println("Falta vc receber:"+r);
		}else {
		System.out.println("Seu salário está dentro da lei");
		}
	}

}
