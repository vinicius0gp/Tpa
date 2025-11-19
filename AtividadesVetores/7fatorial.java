package prjVetor;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
			final int TAM=15;
		    int a[], b[],i, j , fatorial = 1;
		    a = new int [TAM];
		    b = new int [TAM];
		  
		    System.out.println("Digite os valores:");
		    for ( i = 0; i < TAM; i++) {
		    	a[i] = ler.nextInt();
		    }
		    
		    
		    for(i=0;i<TAM;i++) {
		    	
		    	for(j=2;j<=a[i];j++) {
		    	
		    		fatorial *= j;
		    		
		    		
		      }
		    	b[i] = fatorial;
		    }
		    	
		    	
		    	
           System.out.println("Os fatorials é  " );
           for ( i = 0; i < TAM; i++) {
           System.out.println("F[" + a[i] + "] = " + b[i]);
}
	}

	}
	
