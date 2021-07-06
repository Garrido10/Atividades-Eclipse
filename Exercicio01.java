package br.com.generations.exercicios0607;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
Scanner read = new Scanner(System.in);
		
		int[] arrayVetor = new int[5];
		int i, maior = 0;
		
		for (i = 0; i < arrayVetor.length; i++) {
			System.out.print("Insira o " + (i+1) + "º valor: ");
			arrayVetor[i] = read.nextInt();
			
			if(arrayVetor[i] > maior) {
				maior = arrayVetor[i];
			}
		}
		System.out.println("\nO maior valor digitado é: " + maior);
	
		read.close();
		

	}

}
