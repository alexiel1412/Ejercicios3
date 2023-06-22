package Ejercicios3;

import java.util.Scanner;

public class Ej3_3
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int i = 1, num;
		
		do
		{
			System.out.println("Introduzca el número a calcular:");
			num = teclado.nextInt();
		} while (num < 1 || num > 10);
		
		do
		{
			System.out.println(num + " * " + i + " = " + num * i);
			i++;
		} while (i <= 10);
		
		teclado.close();
	}

}
