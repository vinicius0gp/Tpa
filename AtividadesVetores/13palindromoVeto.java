package prjVetor;

import java.util.Scanner;

public class palindromoVeto {

	public static void main(String[] args) {
		   Scanner ler = new Scanner(System.in);
		    final int TAM = 10;
		    int a[], i;
	        a = new int[TAM];

	        System.out.println("Digite os 10 valores do vetor A:");
	        for ( i = 0; i < TAM; i++) {
	            a[i] = ler.nextInt();
	        }

	        for ( i = 0; i < 5; i++) {
	            if (a[i] != a[9 - i]) {
	                System.out.println("O vetor NÃO é um palíndromo.");
	                return;
	            }
	        }

	        System.out.print("O vetor ");
	        for ( i = 0; i < TAM; i++) {
	        	System.out.print(a[i] );
	        }
	        System.out.print( " é um palíndromo");
	        
	    }
	

	}

