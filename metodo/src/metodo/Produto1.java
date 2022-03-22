package metodo;

	public class Produto1 {

		public String nome;
		public int id;
		public double precoCusto;
		public double precoVenda;
		public int quantidade;
		public double margemLucro;

		public void exibirDados() {
			System.out.println("\n===- Dados do produto -===");

			System.out.println("nome: " + this.nome);
			System.out.println("Id: " + this.id);
			System.out.println("precoCusto: R$ " + this.precoCusto);
			System.out.println("precoVenda: R$ "+this.precoVenda);
			System.out.println("Quantity: " + this.quantidade);
			System.out.println("margemLucro: "+this.margemLucro+"%\n");
		}

		public int registrarSaida(int quantidadesaida) {
			this.quantidade -= quantidadesaida;
			System.out.println("Quantidade atual:  " + this.quantidade);
			return this.quantidade;
		}

		public int registrarEntrada(int quantidadeEntrada) {
			this.quantidade += quantidadeEntrada;
			System.out.println("Quantidade atual:  " + this.quantidade);
			return this.quantidade;
		}
		
		public void calcularPrecoVenda() {
			precoVenda = (precoCusto*(margemLucro/100)) + precoCusto;
		}
		
		public double definirPrecoVenda(double precoVendaNovo) {
			if(precoVendaNovo > precoCusto) {
				precoVenda = precoVendaNovo;
				return precoVenda;
			}
			System.out.println("Erro: Valor menor que o preço de custo");
			return 0;
		}
		
}
