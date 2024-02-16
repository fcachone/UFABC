import java.util.Scanner;

public class Escadas
{
	public static void main(String args[])
	{
		int size, ad, ades, i, j;
		Scanner scan = new Scanner(System.in);

		size = scan.nextInt();

		i = 0;
		ad = 0;

		for (j = 0; j < size; j++)
		{
			ades = scan.nextInt();

			if (ad != ades)
			{
				i++;
			}

			ad = ades;
		}

		System.out.println(i);
	}
}
