package controles;

import java.util.Scanner;

public class DesafioWhile {
public static void main(String[] args) {
	//calcular media das notas da turma
	// usuario digita nota de 10 a zero
	// se a nota for valida armazena em uma variavel 
	//nova nota digitada adicionar ao total e calcular 
	//se o usuario digitar -1 finaliza o programa e mostra o total
	Scanner entrada = new Scanner(System.in);
	double total = 0;
	double userType = 0;
	int divisor = 0;
	while(userType != -1) {
		System.out.print("Digite uma nota ou - 1 para sair: ");
		userType = entrada.nextDouble();
		if(userType >= 0 && userType <= 10) {
			divisor++;
			total += userType;
		} else if(userType == -1) {
		System.out.printf("O total é de : %.2f%n", total);
		System.out.printf("O total de notas válidas é de : %d%n \n", divisor);
		System.out.printf("A média foi de : %.2f%n", total / divisor);
		} else {
			System.out.println("NOTA INVALIDA !");
		}
	}
	
	
	entrada.close();
	
	
}}
