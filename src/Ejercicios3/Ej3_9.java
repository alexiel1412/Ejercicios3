package Ejercicios3;

public class Ej3_9
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.println("Tabla del " + i + ":");
			for (int j = 1; j <= 10; j++)
			{
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}

}
