package Ejercicios3;

import java.util.Scanner;

public class Ej3_8
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número:");
		int num = teclado.nextInt();
		for (int i = 1; i <= num / 2; i++)
		{
			if (num % i == 0)
				System.out.println(i);
		}
		teclado.close();
	}

}
