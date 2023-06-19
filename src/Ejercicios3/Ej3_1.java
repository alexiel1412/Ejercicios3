package Ejercicios3;

import java.util.Scanner;

public class Ej3_1
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Número a calcular:");
		int num = teclado.nextInt();
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
