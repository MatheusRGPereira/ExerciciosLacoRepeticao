package ExerciciosRepeticao;

//Soma dos numeros Do -- While
//04/03/2022	
//Matheus

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	
		Scanner leia= new Scanner(System.in);
		
		int n1 ,soma=0;
		 
		do {
			System.out.println("Escreva um numero");
			n1=leia.nextInt();
			soma=soma+n1;
		
		} while(n1 !=0);
			
		   System.out.println("O valor da soma é: "+soma);
					
	}

}
