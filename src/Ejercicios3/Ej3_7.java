package Ejercicios3;

import java.util.Scanner;

public class Ej3_7 {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int num1 = 0, num2 = 0, cont = 0, carga = 1, increm = 7;
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
		{
			carga = -1;
			increm *= carga;
			
			if (num1 % increm==0) num1=num1-7;
			else num1 = num1 -num1 % increm ;
			num2 = num2 - (increm * carga) + (7 - (num2 % increm));
		}
		else
		{
			num1 = num1 + (increm * carga) - num1 % increm;
			num2 = num2 - (increm * carga) + (7 - (num2 % increm));
		}
		
		while (num1 != num2)
		{
			cont ++;
			System.out.print(num1 + " ");
			num1 += increm;
		}
		System.out.println("\n" + cont);
		teclado.close();
	}

}
