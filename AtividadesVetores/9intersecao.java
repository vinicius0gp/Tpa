package prjVetor;

import java.util.Scanner;
public class intersecao {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		final int TAM=10;
	    int a[], b[], c[], i, posC = 0, j;
	    a = new int [TAM];
	    b = new int [TAM];
	    c = new int [TAM];

	    System.out.println("Digite os valores de A");
	    for (i=0; i<TAM; i++) {
	        
	    	a[i] =ler.nextInt();
	    	
	        } 
	    System.out.println("Digite os valores de B");
	    for (i=0; i<TAM; i++) {
	        
	    	b[i] =ler.nextInt();
	    	
	        } 
         
        for (i=0; i<TAM; i++) {
	        for(j=0; j<TAM;j++) {
	        	
	    	if (a[i] == b[j]) {
                c[posC] = a[i];
                posC++;
	    	}
	        } 
        }
	        System.out.println("As Interseções é:");
	        for (i=0; i<posC; i++) {
	            System.out.print(c[i] + " ");
	        }
	     }

	}


