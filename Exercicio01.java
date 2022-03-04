package ExerciciosRepeticao;
//Numeros até 1999

//04/03/2022	
//Matheus

import java.util.*;

public class Exercicio01 {

	public static void main(String[] args) {

		for (int n1 = 1000; n1 <= 1999; n1++) {

			if (n1 % 11 == 5) {

				System.out.println("O numero " + n1 + " Tem como resto o numero 5");
			}

		}

	}
}
