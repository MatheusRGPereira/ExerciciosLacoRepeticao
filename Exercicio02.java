package ExerciciosRepeticao;
//Numeros pares e impares
//04/03/2022	
//Matheus
import java.util.*;
public class Exercicio02 {
		public static void main(String[] args) {		
			Scanner leia= new Scanner(System.in);
			
			int n1,npar=0,nimpar=0;
			
				for(int c =1; c <=10;c++) {
					System.out.println("Digite um numero: ");
					n1=leia.nextInt();
					
					if(n1%2==0)
					{
						npar++;
						
					}else {
						
						nimpar++;
					}
		
				}
				System.out.println("Teve um total de "+npar+" numeros Pares");
				System.out.println("Teve um total de "+nimpar+" numeros Impares");
		}
}
