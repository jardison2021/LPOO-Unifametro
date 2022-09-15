package classes;

public class Conta {
	public int numero;
	public float saldo;
	public float limite = 500; //atribuição de um valor padrão
	
	//sobrecarga de construtores
	
	//construtor padrão (sem parâmetro)
	public Conta() {
		
	}
	//construtor 1 (recebe um valor e atribui ao atributo saldo)
	public Conta(float saldoInicial) {
		saldo = saldoInicial;
	}
	//construtor 2 (recebe valores para saldo e limite)
	public Conta(float saldoInicial, float limiteInicial) {
		saldo = saldoInicial;
		limite = limiteInicial;
	}
	
	public float valorSaldo() {
		return saldo;
	}
}
