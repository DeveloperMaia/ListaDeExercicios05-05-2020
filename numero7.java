import java.util.Scanner;

public class numero7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leitor = new Scanner (System.in);
		
		String nom1, nom2;
		int id1, id2;
		
		System.out.println("Descubra quem é mais velho!");
		
		System.out.println("A primeira pessoa, digite seu nome:");
		nom1 = leitor.nextLine();
		
		System.out.println("E agora digite sua idade:");
		id1=leitor.nextInt();
		
		System.out.println("Agora a segunda pessoa, digite seu nome:");
		nom2 = leitor.next();
		
		System.out.println("E agora sua idade:");
		id2=leitor.nextInt();
		
		if (id1>id2)
		System.out.println("A pessoa mais velha entre vocês é"+nom1+" com "+id1+" anos de idade.");
		if (id1<id2)
			System.out.println("A pessoa mais velha entre vocês é "+nom2+" com "+id2+" anos de idade.");
				
		
		
		
	}

}
