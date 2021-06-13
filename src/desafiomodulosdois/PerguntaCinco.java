package desafiomodulosdois;

import java.util.Scanner;

public class PerguntaCinco {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int[] numeros = new int[10];
		//int[] numerosDigitados = {}, numerosFixos = {};
		
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº número: \n", i + 1);
			numeros[i] = ent.nextInt();
			System.out.printf("%d x %d = %d\n", numeros[i], i+1, numeros[i] * (i+1));
		}		
		
		/*
		 * Possíveis respostas 
		 * 
		 * for(int i = 0; i < 10; i++) {
			
			System.out.printf("%d x %d = %d\n", numerosDigitados[i], numerosFixos[i], 
								numerosDigitados[i] * numerosFixos[i]);
		}
		 * 
		*/		
		
		ent.close();
	}

}
