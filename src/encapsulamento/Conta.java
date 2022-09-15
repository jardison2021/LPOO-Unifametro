package encapsulamento;

public class Conta {
	public int numero;
	public float saldo;
	
	//métodos acessadores get e set (encapsulamento)
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean Sacar (float valorDoSaque) {
		if (saldo >= valorDoSaque) {
			saldo = saldo - valorDoSaque;
			return true;
		}else {
			return false;
		}
	}
	public void definirNumero(int numero) {
		this.numero = numero;
	}
}

