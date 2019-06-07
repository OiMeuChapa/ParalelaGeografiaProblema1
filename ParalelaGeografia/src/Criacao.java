import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Criacao {
	static Scanner input = new Scanner (System.in);	
	
	
	
	int numero; 
	static ArrayList<Casa> casalist = new ArrayList<Casa>();
	static ArrayList<CasaCondominio> casacolist = new ArrayList();
	static ArrayList<Apartamento> apartamentolist = new ArrayList();
	static ArrayList<Imovel_Comercial> imovelclist = new ArrayList();
	

	
	public static void CriarCasa() {
		
		
		String ins_endereco;
		String ins_proprietario;
		String ano_construcao;
		float area;
		
		Casa casa = new Casa();
		//insercao de dados
		
		System.out.println("Insira o endereco");
		ins_endereco = input.next();
		casa.setEndereco(ins_endereco);
		
		System.out.println("Insira o proprietario");
		ins_proprietario = input.next();
		casa.setProprietario(ins_proprietario);
		
		System.out.println("Insira o ano de construcao");
		ano_construcao = input.next();
		casa.setAno_Construcao(ano_construcao);
		
		System.out.println("Insira a area");
		area = input.nextFloat();
		casa.setArea(area);
		
		System.out.println("Cadastro Concluido");
		
		casalist.add(casa);
		
		
		//ordenar
		
		
		
	}
	
	
	
	
	
	
public static void CriarCasaCondominio() {
	
		
		String ins_endereco;
		String ins_proprietario;
		String ano_construcao;
		float area;
		int andar;
		
		CasaCondominio casacond = new CasaCondominio();
		
		//insercao de dados
		
		System.out.println("Insira o endereco");
		ins_endereco = input.next();
		casacond.setEndereco(ins_endereco);
		
		System.out.println("Insira o proprietario");
		ins_proprietario = input.next();
		casacond.setProprietario(ins_proprietario);
		
		System.out.println("Insira o ano de construcao");
		ano_construcao = input.next();
		casacond.setAno_Construcao(ano_construcao);
		
		System.out.println("Insira a area");
		area = input.nextFloat();
		casacond.setArea(area);
		
		System.out.println("Insira o andar");
		andar = input.nextInt();
		casacond.setAndar(andar);
		
		System.out.println("Cadastro Concluido");
		
		casacolist.add(casacond);
		
	}


public static void CriarApartamento() {
	
	
		String ins_endereco;
		String ins_proprietario;
		String ano_construcao;
		float area;
		int andar;
		
		Apartamento apartamento = new Apartamento();
		
		//insercao de dados
		
		System.out.println("Insira o endereco");
		ins_endereco = input.next();
		apartamento.setEndereco(ins_endereco);
		
		System.out.println("Insira o proprietario");
		ins_proprietario = input.next();
		apartamento.setProprietario(ins_proprietario);
		
		System.out.println("Insira o ano de construcao");
		ano_construcao = input.next();
		apartamento.setAno_Construcao(ano_construcao);
		
		System.out.println("Insira a area");
		area = input.nextFloat();
		apartamento.setArea(area);
		
		System.out.println("Insira o andar");
		andar = input.nextInt();
		apartamento.setAndar(andar);
		
		System.out.println("Cadastro Concluido");
		
		
		apartamentolist.add(apartamento);

	
}


public static void CriarImovelComercial() {


	String ins_endereco;
	String ins_proprietario;
	String ano_construcao;
	float area;
	
	
	Imovel_Comercial imovel_com = new Imovel_Comercial();
	
	//insercao de dados
	
	System.out.println("Insira o endereco");
	ins_endereco = input.next();
	imovel_com.setEndereco(ins_endereco);
	
	System.out.println("Insira o proprietario");
	ins_proprietario = input.next();
	imovel_com.setProprietario(ins_proprietario);
	
	System.out.println("Insira o ano de construcao");
	ano_construcao = input.next();
	imovel_com.setAno_Construcao(ano_construcao);
	
	System.out.println("Insira a area");
	area = input.nextFloat();
	imovel_com.setArea(area);
	
	
	System.out.println("Cadastro Concluido");
	
	imovelclist.add(imovel_com);
	




}







	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
