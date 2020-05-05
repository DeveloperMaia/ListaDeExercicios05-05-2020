import java.util.Scanner;

public class numero3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
        Scanner leitor = new Scanner (System.in);
		
		int x;
		
		System.out.println("Digite um número e descubra se ele é Positivo, Negativo ou Neutro:");
		x = leitor.nextInt(); 
		
		if (x > 0) 
	    System.out.println("O número "+x+" é positivo.");
		if (x==0)
		System.out.println("O número "+x+" é neutro.");
		if (x<0)
		System.out.println("O número "+x+" é negativo.");
		
		
		
		
	}

}
