package metodo;
import java.util.*;
public class Aplicacao {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Produto p = new Produto();
	System.out.println("o nome do produto:");
	p.nome = in.next();
	System.out.println("digite o c?dihgo do produto");
	p.codigo = in.nextInt();
	System.out.println("digite o pre?o d custo:");
	p.precoCusto = in.nextInt();
	System.out.println("digite a margem de lucro:");
	p.margemLuc = in.nextDouble();
	System.out.println("Digite a quantidadade no estoque:");
	p.quantidade = in.nextInt();
	System.out.println("register a quantidade de entrada: ");
	p.registrarEntrada= in.nextInt();
	System.out.println("Digite a qantidade de saida:");
	p.registrarSaida1 = in.nextInt();
	p.calcularPrecovenda();
	
	p.exibirDados();
	
	}
}
