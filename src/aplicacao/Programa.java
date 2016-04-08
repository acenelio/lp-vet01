package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int N, i;
		String nomes[];
		double salarios[];
		
		System.out.print("Quantos funcionários voce vai digitar? ");
		N = sc.nextInt();
		
		nomes = new String[N];
		salarios = new double[N];
		
		// PARTE 1: LEITURA DOS DADOS
		
		for (i=0; i<N; i++) {
			System.out.println("Dados do "+(i+1)+"° funcionário: ");
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Salário: ");
			salarios[i] = sc.nextDouble();
		}		

		// PARTE 2: CALCULO DA MEDIA
		
		double soma = 0.0;
		for (i=0; i<N; i++) {
			soma = soma + salarios[i];
		}
		double media = soma / N;
		
		// PARTE 3: MOSTRAR OS NOMES QUE GANHAM ACIMA DA MEDIA
		
		System.out.println("Funcionários que ganham acima da média (R$ "+media+"):");
		for (i=0; i<N; i++) {
			if (salarios[i] > media) {
				System.out.printf("%s (R$ %.2f)\n", nomes[i], salarios[i]);
			}
		}	
		
		sc.close();
	}
}



