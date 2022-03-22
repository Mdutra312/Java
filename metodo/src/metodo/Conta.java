package metodo;

public class Conta {
	public String nomeCorrentista;
	public double saldo;
	public double LimiteCheq;
	
	public void abreConta(String nome,double saldo,double limite){
		this.nomeCorrentista = nome;
		this.LimiteCheq=limite;
		this.saldo = saldo;
	}public void depositaValor(double valor ){
		this.saldo = valor+this.saldo;
		
	}public void retiraValor( double valor) {
		if(saldo<valor) {
			System.out.println("o valor m pode ser sacado!");
		}
	}public double retiraValor2(double valor){
		this.saldo = saldo-valor;
		return saldo;
	}
	public double exibir(){
		
		return this.saldo; 
	}
}
