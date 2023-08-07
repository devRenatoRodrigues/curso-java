package controles;

import java.util.Scanner;

public class IfElseIf {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digita a nota:");
	double nota = entrada.nextDouble();
	if(nota > 10 || nota < 0) {
		System.out.println("Nota Inválida");
	} else if (nota >= 8.1) {
		System.out.println("Conceito A");
	} else {
		System.out.println("Conceito B");
	}
	
	entrada.close();
}
}
