package java_vetores_matrizes;

import java.util.Scanner;

public class exercicio_3 {
	public static void main(String[] args) {
		
		int matriz[][]= new int[3][3],linha, coluna, somaDiag1 = 0, somaDiag2 = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		for(linha=0;linha < 3; linha++) {
			for(coluna= 0; coluna < 3; coluna++) {
				System.out.println("Entre com o valor para a posição " + linha + "," + coluna + ":");
				matriz[linha][coluna] = input.nextInt();
				
				if (linha == coluna) {
					somaDiag1 += matriz[linha][coluna];
					
				}
				
				if (linha + coluna == 2) {
					somaDiag2 += matriz[linha][coluna];
					
				}
			}
		}
		
		System.out.println("Elementos da Diagonal Principal: ");
		for(linha=0;linha < 3; linha++) {
			for(coluna= 0; coluna < 3; coluna++) {
				if (linha == coluna) {
					System.out.println(matriz[linha][coluna]);
					
				}
			}
			
		}
		
		System.out.println("Elementos da Diagonal Secundaria: ");
		for(linha=0;linha < 3; linha++) {
			for(coluna= 0; coluna < 3; coluna++) {
				if (linha + coluna == 2) {
					System.out.println(matriz[linha][coluna]);
					
				}
			}
			
		}
		
		
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiag1 );
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiag2 );
		
		
	}
}
