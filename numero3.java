import java.util.Scanner;

public class numero3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
        Scanner leitor = new Scanner (System.in);
		
		int x;
		
		System.out.println("Digite um n�mero e descubra se ele � Positivo, Negativo ou Neutro:");
		x = leitor.nextInt(); 
		
		if (x > 0) 
	    System.out.println("O n�mero "+x+" � positivo.");
		if (x==0)
		System.out.println("O n�mero "+x+" � neutro.");
		if (x<0)
		System.out.println("O n�mero "+x+" � negativo.");
		
		
		
		
	}

}
