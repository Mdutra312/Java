import java.util.Scanner;

public class MainPai {
public static void main(String[] args) {
	Pai p = new Pai(null, null, null, 0);
	Scanner in = new Scanner(System.in);
	System.out.println("Qual o seu nome completo?");
	p.nome = in.nextLine();
	System.out.println("Qual a sua cor?");
	p.cor = in.next();
	System.out.println("Qual a sua idade ?");
	p.DiferencaIdade = in.nextInt();
	System.out.println("Informe seu cpf: ");
	p.cpf = in.next();
	
	p.imprime();
	
}
}
