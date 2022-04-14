
public class Pai {
	String cor;
	String nome;
	String cpf;
	int DiferencaIdade;
	public Pai(String cor,String nome,String cpf,int DiferencaIdade){
		this.cor = cor;
		this.cpf = cpf;
		this.DiferencaIdade=DiferencaIdade;
		this.nome = nome;
	}
	public void imprime() {
		System.out.println("Nome:"+this.nome);
		System.out.println("Cor:"+this.cor);
		System.out.println("Cpf:"+this.cpf);
		System.out.println("diferença de idade:"+this.DiferencaIdade);
	}
	
}
