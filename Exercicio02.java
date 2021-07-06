package br.com.generations.exercicios0607;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	
Scanner read = new Scanner(System.in);
		
		int[] arrayVetor = new int[4];
		int i, maior = 0, maiorOcorrencia = 1, soma = 0;
		double media = 0.0;
		
		for (i = 0; i < arrayVetor.length; i++) {
			System.out.print("Digite o " + (i+1) + "º lançamento: ");
			arrayVetor[i] = read.nextInt();
			soma += arrayVetor[i];
			media = soma/arrayVetor.length;
			
			if (arrayVetor[i] > maior ) {
				maior = arrayVetor[i];
			}
			else if (arrayVetor[i] == maior) {
				maiorOcorrencia++;
			}
		}
		System.out.println("\nA média dos lançamentos é :" + media);
		System.out.println("O maior valor apareceu " + maiorOcorrencia + " vezes");
		read.close();
		

	}

}
