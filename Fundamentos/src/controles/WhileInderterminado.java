package controles;

import java.util.Scanner;

public class WhileInderterminado {
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	String userType = "";
//Minha solução !!!
//	while(true) {
//		System.out.println("Digite uma Palavra: ");
//		userType = entrada.next();
//		System.out.println(userType);
//		if(userType.equalsIgnoreCase("Sair")) {
//			break;
//		}
//	}
	while(!userType.equalsIgnoreCase("Sair")) {
		System.out.println("Digite uma Palavra: ");
		userType = entrada.nextLine();
		System.out.println(userType);
	}
	entrada.close();
}
}
