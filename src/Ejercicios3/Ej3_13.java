package Ejercicios3;

import java.util.Scanner;

public class Ej3_13
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int cont = 0;
		System.out.println("Introduzca un número natural:");
		int num = teclado.nextInt();
		
		while (num < 1)
		{
			System.out.println("Debe ser natural.");
			num = teclado.nextInt();
		}
		
		for (int i = 1; i <= Math.sqrt(num);i++)
			if (num % i == 0)
				cont++;
		
		if (cont == 1)
			System.out.println("El número es primo.");
		else
			System.out.println("El número no es primo.");
	}
}
