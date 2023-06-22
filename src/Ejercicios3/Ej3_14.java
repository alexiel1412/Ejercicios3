package Ejercicios3;

import java.util.Scanner;

public class Ej3_14
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int num1, num2, cociente = 0, resto;
		System.out.println("Introduzca un número natural:");
		num1 = teclado.nextInt();
		
		while (num1 < 1)
		{
			System.out.println("Debe ser natural.");
			num1 = teclado.nextInt();
		}
		
		System.out.println("Introduzca otro número natural e inferior que el primero:");
		num2 = teclado.nextInt();
		
		while (num2 < 1 || num1 < num2)
		{
			System.out.println("Debe ser natural e inferior al primero.");
			num2 = teclado.nextInt();
		}
		resto = num1;
		
		while (resto >= num2)
		{
			resto -= num2;
			cociente++;
		}
		System.out.println(num1 + " / " + num2 + " = " + cociente);
	}

}
