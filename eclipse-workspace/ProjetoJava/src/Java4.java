
import java.util.Scanner;
public class Java4 {
	
	   public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int[] vetor = new int[5];

	        // Solicita ao usuário que digite cinco números
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print("Digite o " + (i+1) + "º número: ");
	            vetor[i] = input.nextInt();
	        }

	        // Imprime o valor presente na terceira posição do vetor
	        System.out.println("O valor presente na posição três é: " + vetor[2]);
	    }
	}


