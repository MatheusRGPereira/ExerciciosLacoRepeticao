package ExerciciosRepeticao;

//Media dos multiplos de 3
//04/03/2022	
//Matheus

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
 
		Scanner leia = new Scanner(System.in);

		int n1,contador=-1;
		double media = 0, soma = 0;
 
		do {
			System.out.println("Digite um numero: ");
			n1 = leia.nextInt();
			if (n1 % 3 == 0) {
				soma = soma + n1;
				contador++;

			}

		} while (n1 != 0);
		media = soma / contador;
		System.out.println("A media dos numeros multiplos de 3 " + media);
	}
}
