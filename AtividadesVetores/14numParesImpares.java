package prjVetor;

import java.util.Scanner;

public class numParesImpares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	    final int TAM=10;
	    int a[], b[], i;
	    a = new int [TAM];
	    b = new int [TAM];
	   
	   System.out.println("Digite os 20 elementos do vetor A:");
	   
	  
	   for ( i = 0; i < TAM; i++) {
		   a[ i] =ler.nextInt();
	   }
		   int[] B = new int[20];
	        int indexB = 0;
	   
	     
	        for ( i = 0; i < TAM; i++) {
	            if (a[i] % 2 == 0) {
	                b[indexB] = a[i];
	                indexB++;
	            }
	        

	        for ( i = 0; i < TAM; i++) {
	            if (a[i] % 2 != 0) {
	                b[indexB] = a[i];
	                indexB++;
	            }
	        }
	        
	        System.out.println("Vetor A: " + a[i]);
	        System.out.println("Vetor B (pares seguidos por ímpares): " + b[i]);
	    }
	}
	   
	           
	}


