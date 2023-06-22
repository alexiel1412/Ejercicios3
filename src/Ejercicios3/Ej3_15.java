package Ejercicios3;

import java.util.Scanner;

public class Ej3_15
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		double num1 = 0, num2 = 0, res = 0;
		int oper = -1;
		do
		{
			System.out.println("Introduzca el calculo:");
			System.out.println("1 --- Suma.");
			System.out.println("2 --- Resta.");
			System.out.println("3 --- Multiplicación.");
			System.out.println("4 --- División.");
			System.out.println("5 --- Raíz.");
			System.out.println("6 --- Potencia.");
			System.out.println("---");
			System.out.println("0 --- Salir.");
			oper = teclado.nextInt();

			if (oper > 0 && oper <= 6)
			{
				System.out.println("Introduzca el primer número:");
				num1 = teclado.nextInt();
				if (oper != 5)
				{
					System.out.println("Introduzca el segundo número:");
					num2 = teclado.nextInt();
				}
			}
			
			switch (oper)
			{
				case 1:
					res = num1 + num2;
					System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
					break;
				case 2:
					res = num1 - num2;
					break;
				case 3:
					res = num1 * num2;
					break;
				case 4:
					res = num1 / num2;
					break;
				case 5:
					res = Math.sqrt(num1);
					break;
				case 6:
					res = Math.pow(num1, num2);
					break;
				case 0:
					System.out.println("Cerrando programa ...");
					teclado.close();
					return;
				default:
					System.out.println("Error, debe introducir una operación de la lista.");
					break;  // Para no lanzar el resultado si hay error
			}
			System.out.println(res);
		} while (oper != 0);
		teclado.close();
	}

}
