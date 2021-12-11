package teste;

import java.util.Scanner;

public class Modulo9 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	int num;
	
	System.out.printf("Digite um numero inteiro:");
	num = ler.nextInt();
	
	Integer num1 = Integer.valueOf(num);
	
	System.out.println(num1.getClass().getSimpleName());
	

	
	}
}
