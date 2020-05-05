import java.util.Scanner;

public class numero9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leitor = new Scanner(System.in);
		
		double x ;
		
		System.out.println("Digite o preço de compra do produto:");
		x=leitor.nextDouble();
		
		if (x<=20)
			System.out.println("Deverá vender tal produto pelo preço de "+(x*45/100+x)+"R$.");
		else
			System.out.println("Deverá vender tal produto pelo preço de "+(x*30/100+x)+"R$.");
		
		
		
		
		
		
		

	}

}
