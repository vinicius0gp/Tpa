package prjVetor;
import java.util.Scanner;
public class divisor {
	
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        final int TAM = 10;
	        int a[],i;
	        a = new int[TAM];
	        System.out.println("Digite os 10 elementos inteiros do vetor A:");
	        for ( i = 0; i < TAM; i++) {
	            a[i] = ler.nextInt();
	        }
	        for ( i = 0; i < TAM; i++) {
	            int numero = a[i];
	            System.out.println("Elemento " + numero + ": Divisores:");
	            for (int j = 1; j <= numero; j++) {
	                if (numero % j == 0) {
	                    System.out.print(j + " ");
	                }
	            }
	            System.out.println();
	        }
	    }
  
	     
	    
}
