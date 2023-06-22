package Ejercicios3;

import java.util.Scanner;

public class Ej3_2
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int i = 1;
		System.out.println("Introduzca el número a calcular:");
		int num = teclado.nextInt();
		
		while (num < 1 || num > 10)
		{
			System.out.println("El número debe ser entero entre 1 y 10:");
			num = teclado.nextInt();
		}
		
		while (i <= 10)
		{
			System.out.println(num + " * " + i + " = " + num * i);
			i++;
		}
		teclado.close();
	}

}
