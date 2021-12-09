package teste;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, nota4;
		
		System.out.printf("Informe a primeira nota:");
		nota1 = ler.nextDouble();

		System.out.printf("Informe a segunda nota:");
		nota2 = ler.nextDouble();
		
		System.out.printf("Informe a terceira nota:");
		nota3 = ler.nextDouble();
		
		System.out.printf("Informe a quarta nota:");
		nota4 = ler.nextDouble();
		
		double total = (nota1+nota2+nota3+nota4) / 4;
		
		System.out.println("media das notas é:"+ total);
		
		
		
		
		
		
		
		
	}

}
