package ExerciciosRepeticao;

//Total de idades de - 21 anos e + 50
//04/03/2022	
//Matheus

import java.util.*;
public class Exercicio03 {
			public static void main(String[] args) {
				Scanner leia= new Scanner(System.in);
				
				int idade=0,menor=0,maior=0;
				
			 
				while(idade < 99)
				{	
					System.out.println("Digite a sua idade");
					idade=leia.nextInt();
					if(idade <=21)
					{
						menor++;
					}else if (idade >=50)
						maior++;
				}
			System.out.println("Tivemos o total de "+menor+" Menores de 21 anos");
			System.out.println("Tivemos o total de "+maior+" Maiores de 50 anos");
			}
}
