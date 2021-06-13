package desafiomodulosdois;

import java.util.Scanner;
import java.io.*;


public class PerguntaSete {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[50];
		int contaNros = 0;
		char continuar = 'S';
		while(continuar == 'S' || continuar == 's') {
			System.out.printf("Digite o %dº número:\n", contaNros + 1);
			numeros[contaNros] = entrada.nextInt();
			contaNros ++;
			entrada.nextLine();
			System.out.println("Deseja continuar digitando números (S - sim. N - Não)?");
			continuar = entrada.nextLine().charAt(0);
		}
		
		try {
			FileWriter arq = new FileWriter("C:\\Users\\helin\\eclipse\\Nova\\saida.txt");
			PrintWriter gravarArquivo = new PrintWriter(arq);
			for(int i = 0; i < contaNros; i ++) {
				gravarArquivo.printf("%d\n", numeros[i]);
			}
			arq.close();
			gravarArquivo.close();
			System.out.println("Processo Finalizado.");
		} catch (IOException e) {
			System.err.println("Erro gravando dados: " + e.getMessage());
		}
		
		entrada.close();

	}

}
