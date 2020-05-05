import java.util.Scanner;

public class numero5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leitor = new Scanner (System.in);
		
		float x, y, z;
		
		System.out.println(" Digite sua nota na primeira prova:");
		x = leitor.nextFloat();
		System.out.println(" Digite sua nota na segunda prova:");
		y = leitor.nextFloat();
		System.out.println(" Digite sua nota na terceira prova:");
		z = leitor.nextFloat();
		
		System.out.println("Sua média foi de "+(x+y+z)/3);
		
		if ((x+y+z)/3 >= 7)
			System.out.println("Você foi aprovado!");
		if ((x+y+z)/3 < 7)
			System.out.println("Você foi reprovado!");
		
		
		
		
	}

}
