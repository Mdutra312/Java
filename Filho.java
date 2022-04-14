
public class Filho extends Pai {
	
	String sobrenomeMae;
	int idade;
	String corDoOlho;
	public Filho(String cor, String nome, String cpf, int DiferencaIdade, String sobrenomeMae, String corDoOlho,int idade) {
		super(cor, nome, cpf, DiferencaIdade);
		this.cor = cor;
		this.cpf = cpf;
		this.DiferencaIdade=DiferencaIdade;
		this.nome = nome;
		this.corDoOlho = corDoOlho;
		this.idade=idade;
		this.sobrenomeMae = sobrenomeMae;
	}
	public void imprime() {
		super.imprime();
	}
	public void CalcularDiferencaDeIdade() {
		this.DiferencaIdade = this.idade-this.DiferencaIdade;
		System.out.println("A diferença de idade é de: "+this.DiferencaIdade);
	}

}
