package Ejercicios3;

import java.util.Scanner;

public class Ej3_4
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int num1, num2, carga = 1;
		System.out.println("Introduzca un número:");
		num1 = teclado.nextInt();
		System.out.println("Introduzca otro número:");
		num2 = teclado.nextInt();
		
		if (num1 == num2)
		{
			System.out.println("Son el mismo número.");
			teclado.close();
			return;
		}
		if (num2 < num1)
			carga = -1;
		
		while (num1 != num2 + carga)
		{
			if (num1 % 2 != 0)
				System.out.print(" " + num1);
			num1 += carga;
		}
			teclado.close();
	}
}
