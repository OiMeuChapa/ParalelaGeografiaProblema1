import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.lang.Comparable;

public class Menu {
	static Scanner input = new Scanner (System.in);
	
	//Menu Cadastro
	public static void cadastrar() {
		
		int opcao;
		System.out.println("1- Cadastrar Casa");
		System.out.println("2- Cadastrar Casa Condominio");
		System.out.println("3- Cadastrar Apartamento");
		System.out.println("4- Cadastrar Imovel Comercial");
		System.out.println("5- Nada");
		opcao = input.nextInt();
		
		switch (opcao) {
		
		case 1:
			Criacao.CriarCasa();
			break;
		case 2:
			Criacao.CriarCasaCondominio();
			break;
		case 3:
			Criacao.CriarApartamento();
			break;
		case 4:
			Criacao.CriarImovelComercial();
			break;
		}				
	}
	
	
	public static void Lists() {
		int opcao2;
		System.out.println("1- Casas");
		System.out.println("2- Casa Condominio");
		System.out.println("3- Apartamentos");
		System.out.println("4- Imoveis Comerciais");
		System.out.println("5- Todos");
		System.out.println("6- Nada");
		opcao2 = input.nextInt();
		
		
		switch(opcao2) {
		
		case 1:
			mostrarcadscasas();
			break;
		case 2:
			mostrarcadscasacond();
			break;
		case 3:
			mostrarcadsapart();
			break;
		case 4:
			mostrarcadsimov();
			break;
		case 5:
			mostrarcadscasas();
			mostrarcadscasacond();
			mostrarcadsapart();
			mostrarcadsimov();
		case 6:
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//Printar Listas	
	public static void mostrarcadscasas() {

		System.out.print(" ind ");
		System.out.print(" endereco ");
		System.out.print(" prop ");
		System.out.print(" ano ");
		System.out.print(" area ");
		System.out.print(" impostos ");
		System.out.println(" ");
		
		for(int i = 0; i < Criacao.casalist.size(); i++) {
			Casa batata = Criacao.casalist.get(i);
			
			float imp = (float) (batata.Area * 10.7);
			
			
			 System.out.print(i+"- ");
			 System.out.print(batata.Endereco + " ");
			 System.out.print(batata.Proprietario + " ");
			 System.out.print(batata.Ano_Construcao + " ");
			 System.out.print(batata.Area + " ");
			 System.out.print(imp);
			 System.out.println(" ");
			 
		}	
	}
	
	
	
	
	
	
	public static void mostrarcadsapart() {
		
		System.out.print(" ind ");
		System.out.print(" endereco ");
		System.out.print(" prop ");
		System.out.print(" ano ");
		System.out.print(" andar ");
		System.out.print(" area ");
		System.out.print(" impostos ");
		System.out.println(" ");
		
		for(int i = 0; i < Criacao.apartamentolist.size(); i++) {
			Apartamento batata = Criacao.apartamentolist.get(i);
			
			float imp = (float) (batata.Area * 8.5);
			
			 System.out.print(i+"- ");
			 System.out.print(batata.Endereco + " ");
			 System.out.print(batata.Proprietario + " ");
			 System.out.print(batata.Ano_Construcao + " ");
			 System.out.print(batata.Andar + " ");
			 System.out.print(batata.Area + " ");
			 System.out.print(imp);
			 System.out.println(" ");
			 
		}	
	}
	
	public static void mostrarcadsimov() {
		
		System.out.print(" ind ");
		System.out.print(" endereco ");
		System.out.print(" prop ");
		System.out.print(" ano ");
		System.out.print(" area ");
		System.out.print(" impostos ");
		System.out.println(" ");
		
		for(int i = 0; i < Criacao.imovelclist.size(); i++) {
			Imovel_Comercial batata = Criacao.imovelclist.get(i);

			float imp = (float) (batata.Area * 10.7);
			
			 System.out.print(i+"- ");
			 System.out.print(batata.Endereco + " ");
			 System.out.print(batata.Proprietario + " ");
			 System.out.print(batata.Ano_Construcao + " ");
			 System.out.print(batata.Area + " ");
			 System.out.print(imp);
			 System.out.println(" ");
			 
		}	
	}
	
public static void mostrarcadscasacond() {
		
		
	System.out.print(" ind ");
	System.out.print(" endereco ");
	System.out.print(" prop ");
	System.out.print(" ano ");
	System.out.print(" andar ");
	System.out.print(" area ");
	System.out.print(" impostos ");
	System.out.println(" ");
	
		for(int i = 0; i < Criacao.casacolist.size(); i++) {
			CasaCondominio batata = Criacao.casacolist.get(i);
			
			float imp = (float) (batata.Area * 9);
			
			 System.out.print(i+"- ");
			 System.out.print(batata.Endereco + " ");
			 System.out.print(batata.Proprietario + " ");
			 System.out.print(batata.Ano_Construcao + " ");
			 System.out.print(batata.Andar + " ");
			 System.out.print(batata.Area + " ");
			 System.out.print(imp);
			 System.out.println(" ");
			 
		}	
	}
	
//menu remover

public static void Remover() {
	int opcao3;
	System.out.println("1- Casas");
	System.out.println("2- Casa Condominio");
	System.out.println("3- Apartamentos");
	System.out.println("4- Imoveis Comerciais");
	System.out.println("5- Nada");
	
	opcao3 = input.nextInt();
	
	
	switch(opcao3) {
	
	case 1:
		removercasas();
		break;
	case 2:
		removercasascond();
		break;
	case 3:
		removerapart();
		break;
	case 4:
		removerimovelc();
		break;
	case 5:
		break;
	}
}

//Remover itens
	public static void removercasas() {
		mostrarcadscasas();
		
		System.out.println("Digite o numero do elemento a ser removido");
		int rem = input.nextInt();
		
		Criacao.casalist.remove(rem);
		
		System.out.println("Removido");
		
	}
	
	public static void removercasascond() {
		mostrarcadscasacond();
		
		System.out.println("Digite o numero do elemento a ser removido");
		int rem = input.nextInt();
		
		Criacao.casacolist.remove(rem);
		
		System.out.println("Removido");
		
	}
	
	public static void removerapart() {
		mostrarcadsapart();
		
		System.out.println("Digite o numero do elemento a ser removido");
		int rem = input.nextInt();
		
		Criacao.apartamentolist.remove(rem);
		
		System.out.println("Removido");
		
	}
	
	public static void removerimovelc() {
		mostrarcadsimov();
		
		System.out.println("Digite o numero do elemento a ser removido");
		int rem = input.nextInt();
		
		Criacao.imovelclist.remove(rem);
		
		System.out.println("Removido");
		
	}
	
	
	
	
}
	
	

