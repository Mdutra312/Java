package metodo;

public class Produto {
	String nome;
	public int codigo;
	public double precoCusto;
	public double precoVenda; 
	public int quantidade;
	public double margemLuc;
	public int registrarSaida1;
	public int registrarEntrada;
	
	
	public void registrarSaida1(){
		
		this.quantidade = quantidade-this.registrarEntrada;
		System.out.println("quantidade atual:"+quantidade);
		
	}
	public int registrarEntrada1(int quantidadeEntrada){
		this.quantidade+=quantidadeEntrada;
		System.out.println("quantidade atual:"+this.quantidade);
	return this.quantidade;
	}
	
	public void calcularPrecovenda(){
		this.precoVenda=precoCusto+(margemLuc*precoCusto)/100;
	}
	public double definirPrecoVenda(double verifica, double verifica2 ) {
	
		return verifica;
		}
	public void exibirDados(){
		System.out.println("nome:"+this.nome);
		System.out.println("preco custo:"+this.precoCusto);
		System.out.println("preço de venda:"+this.precoVenda);
		System.out.println("quantidade "+this.quantidade);
		System.out.println("codigo:"+this.codigo);

	}
		
	}
	
