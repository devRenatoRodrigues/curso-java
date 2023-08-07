package fundamentos.operadores;

public class DesafioLogicos {
public static void main(String[] args) {
	//Trabalho na terça (V ou F)
	//Trabalho na quinta (V ou F)
	
	boolean trabalho1 = true;
	boolean trabalho2 = true;
	
	boolean tv52 = trabalho1 && trabalho2;
	boolean tv32 = trabalho1 ^ trabalho2;
	boolean fomosAoShopping = trabalho1 || trabalho2;
	boolean maisSaudavel = !fomosAoShopping;
	System.out.println("Comprou Tv 50\"?" + tv52);
	System.out.println("Comprou Tv 32\"?" + tv32);
	System.out.println("Teve sorvete\"?" + fomosAoShopping);
	System.out.println("Mais saudavel\"?" + maisSaudavel);
}
}
