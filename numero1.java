import java.util.Scanner;

public class ListaDeExercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leitor = new Scanner (System.in);
		
		int x;
		
		System.out.println("Digite um n�mero e descubra se ele � maior que 20:");
		x = leitor.nextInt(); 
		
		if (x > 20) 
	    System.out.println("O n�mero "+x+" � maior que 20.");
		if (x==20)
		System.out.println("O n�mero 20 � igual � 20");
		if (x<20)
		System.out.println("O n�mero "+x+" � menor que 20");
		
		
		
		
		
	}

}
