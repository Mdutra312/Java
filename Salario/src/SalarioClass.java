import java.util.Scanner;
public class SalarioClass {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int sal, salminimo, r;
		System.out.println("DIgite seu sal�rio:");
		sal = in.nextInt();
		System.out.println("Digite o sal�rio m�nimo:");
		salminimo = in.nextInt();
		if (sal<salminimo){
			r = salminimo-sal;
		System.out.println("Seu sal�rio est� fora da lei");
		System.out.println("Falta vc receber:"+r);
		}else {
		System.out.println("Seu sal�rio est� dentro da lei");
		}
	}

}
