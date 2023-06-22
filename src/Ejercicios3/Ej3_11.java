package Ejercicios3;

public class Ej3_11
{
	public static void main(String[] args)
	{
		int i = 1;
		do
		{
			int j = 1;
			System.out.println("Tabla del " + i + ":");
			do
			{
				System.out.println(i + " * " + j + " = " + (i * j));
				j++;
			} while (j <= 10);
			System.out.println();
			i++;
		} while (i <= 10);

	}

}
