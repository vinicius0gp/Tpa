package prjVetor;

import java.util.Scanner;

public class vetoParImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM= 10;
		  int a[], b[], i;
		    a = new int [TAM];
		    b = new int [TAM];

	    System.out.println("Digite os 10 valores do vetor A:");
	    for ( i = 0; i < 10; i++) {
	        a[i] = ler.nextInt();
	        if (a[i] % 2 == 0)
	            b[i] = 1;
	        else
	            b[i] = 0;
	    }

	    System.out.println("Vetor B:");
	    for ( i = 0; i < TAM; i++) {
	        System.out.print(b[i] + " ");
	    }

	  }
	

	}


