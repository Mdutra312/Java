import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Filho f = new Filho(null, null, null,0,null,null,0);
	
	System.out.println("Digite seu nome:");
	f.nome = in.next();
	
	System.out.println("Digite sua cor:");
	f.cor = in.next();
	
	System.out.println("Digite seu cpf: ");
	f.cpf = in.next();
	System.out.println("Digite sua idade:");
	f.DiferencaIdade = in.nextInt();
	
	
	f.imprime();
	
}
}
