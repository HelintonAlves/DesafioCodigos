package desafiomodulosdois;

import java.util.Scanner;

public class PerguntaDoze {

	public static void main(String[] args) {
		int n1 = 0;
		boolean resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro..:");
		n1 = entrada.nextInt();
		
		resultado = (n1 % 2 == 0); //Operação booleana
		
		System.out.println(resultado);
		
		entrada.close();

	}

}
