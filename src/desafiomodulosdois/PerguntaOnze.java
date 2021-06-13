package desafiomodulosdois;

import java.util.Scanner;
import java.util.Random;

public class PerguntaOnze {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int[] valores = new int[1000], repeticoes = new int[1000];
		int limiteSuperior = 100;
		Random random = new Random(); //classe para gerar n�meros aleat�rios
		
		for(int i = 0; i < 1000; i++) {
			valores[i] = random.nextInt(limiteSuperior); //m�todo para gerar n�meros aleat�rios
		}
		
		for(int i = 0; i < 1000; i++) {
			repeticoes[valores[i]]++;
		}
		for(int i = 0; i < 100; i ++) {
			System.out.printf("O n�mero %d repete %d vezes.\n", i, repeticoes[i]);
		}
		
		ent.close();

	}

}
