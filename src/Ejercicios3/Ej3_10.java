package Ejercicios3;

public class Ej3_10
{
	public static void main(String[] args)
	{
		int i = 1;
		while (i <= 10)
		{
			int j = 1;
			System.out.println("Tabla del " + i + ":");
			while (j <= 10)
			{
				System.out.println(i + " * " + j + " = " + (i * j));
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
