package polimorfismo;
import java.util.Scanner;
public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forma f = new Forma();
		f.Desenhar();
		
		Forma c = new Circulo();
		c.Desenhar();
		
		Forma r = new Retangulo();
		r.Desenhar();
		
		Forma t = new Triangulo();
		t.Desenhar();
		
		try (Scanner teclado = new Scanner(System.in)) {
			int tipo = 0;
			Forma formaGeometrica = null;
			
			System.out.println("Qual a forma geométrica?");
			System.out.println("1. Círculo");
			System.out.println("2. Retângulo");
			System.out.println("3. Triângulo");
			tipo = teclado.nextInt();
			
			if (tipo == 1) {
				formaGeometrica = new Circulo();
			}else if(tipo == 2) {
				formaGeometrica = new Retangulo();
			}else if(tipo == 3) {
				formaGeometrica = new Triangulo();
			}else {
				formaGeometrica = new Forma();
			}
			formaGeometrica.Desenhar();
		}
	}

}
