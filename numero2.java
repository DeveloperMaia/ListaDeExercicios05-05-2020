import java.util.Scanner;

public class numero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Scanner leitor = new Scanner (System.in);
		
		int x , y ;
		
		
		System.out.println("Digite um n�mero:");
		x=leitor.nextInt();
		System.out.println("Digite outro n�mero:");
		y=leitor.nextInt();
		
		
		
		
		if (x+y>10) 
	    System.out.println("O resultado � igual � "+(x+y)+" que � maior que 10.");
		if (x+y==10)
		System.out.println("O resultado � igual � "+(x+y)+" que � igual � 10");
		if (x+y<10)
		System.out.println("O resultado � igual � "+(x+y)+" que � menor que 10");
		
		
	}

}
