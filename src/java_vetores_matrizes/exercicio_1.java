package java_vetores_matrizes;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		int vetor[] = {2,5,1,3,4,9,7,8,10,6},n,i,posicao;
		boolean encontrado=false;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o número que você deseja encontrar:");
		n = input.nextInt();
		
		for(i=0; i < vetor.length; i++) {
			if(vetor[i] == n){
				posicao = i;
				encontrado = true;
				System.out.println("\nO número " + n + " está localizado na posição: " + posicao);
				
			}

		}
		if(encontrado == false) {
			System.out.println("\nO número " + n + " não foi encontrado!");
		}
	}
}
