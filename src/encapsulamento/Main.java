package encapsulamento;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Conta minhaConta = new Conta();
		minhaConta.definirNumero(123456);
		minhaConta.setSaldo(2000);
		float valorSaque;
		
		System.out.println("Informa o valor do saque:");
		valorSaque = teclado.nextFloat();
		
		System.out.println("== Extrato ==");
		System.out.println(">Saldo anterior: " + minhaConta.getSaldo());
		if(minhaConta.Sacar(valorSaque)) {
			System.out.println(">Saque realizado com suecesso!");
		}else {
			System.out.println(">Saque não realizado!");
		}
		System.out.println(">Saldo atual: " + minhaConta.getSaldo());
	}
}
