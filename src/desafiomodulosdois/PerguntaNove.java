package desafiomodulosdois;

import java.util.Scanner;

public class PerguntaNove {

	public static void main(String[] args) {
		int n = 0, somador = 0;
		Scanner entrada = new Scanner(System.in);
		
		/*
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite números: ");
			n = entrada.nextInt();
			somador = somador + n;
		}
		*/
		
		int i = 0;
		while(i < 10) {
			System.out.println("Digite números: ");
			n = entrada.nextInt();
			somador = somador + n;
			i++;
		}
		
		System.out.printf("O valor somado é: %d.", somador);
		
		entrada.close();

	}

}
