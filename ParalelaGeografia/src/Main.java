import java.util.Scanner;
public class Main {
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		boolean bazinga = true;
		
		do {
		int opcao;
		System.out.println("1- Cadastro");
		System.out.println("2- Remocao");
		System.out.println("3- Listas");
		System.out.println("4- Sair");
		opcao = input.nextInt();
		
		
		switch(opcao) {
		
		case 1:
			Menu.cadastrar();
			break;
		case 2:
			Menu.Remover();
			break;
		case 3:
			Menu.Lists();
			break;
		case 4:
			
			bazinga = false;
			break;
		}
	}while(bazinga == true);
}
}
