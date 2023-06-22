package Ejercicios3;

import java.util.Scanner;

public class Ej3_6
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int num, res = 1;
		System.out.println("Introduzca un número positivo:");
		num = teclado.nextInt();
		if (num <= 0 )
			return;
		for (int i=1; i <= num; i++)
		{
			res *= i;
			System.out.println(res);
		}
		System.out.println(res);
		teclado.close();
	}
}
