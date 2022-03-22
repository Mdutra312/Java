package metodo;
import java.util.*;
public class Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Conta c = new Conta();
		System.out.println("Qual o seu nome:");
		c.nomeCorrentista = in.next();
		System.out.println("Informe o saldo:");
		c.saldo = in.nextInt();
		System.out.println("Digite o limite cheque:");
		c.LimiteCheq = in.nextDouble();
		
	}
}
