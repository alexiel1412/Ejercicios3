package Ejercicios3;

import java.util.Scanner;

public class Ej3_12 {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int suma = 0;
		for (int j = 1; j <= 100; j++)
		{
			suma = 0;
			for (int i = 1; i <= j / 2; i++)
			{
				if (j % i == 0)
					suma += i;
			}
			if (suma == j)
				System.out.println("El número " + j + " es perfecto.");
			else
				System.out.println("El número " + j + " no es perfecto.");
		}
	}

}
