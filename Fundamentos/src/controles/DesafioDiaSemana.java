package controles;

import java.util.Scanner;

public class DesafioDiaSemana {
public static void main(String[] args) {
	
	
	Scanner entrada = new Scanner(System.in); 
	System.out.println("Digite um dia da semana:");
	String day = entrada.next().toLowerCase();
	
	if(day.equals("domingo")) {
		System.out.println(1);
	} else if(day.equals("segunda")) {
		System.out.println(2);
	} else if(day.equals("terça")) {
		System.out.println(3);
	} else if(day.equals("quarta")) {
		System.out.println(4);
	} else if(day.equals("quinta")) {
		System.out.println(5);
	} else if(day.equals("sexta")) {
		System.out.println(6);
	} else if(day.equals("sábado")) {
		System.out.println(7);
	} else {
		System.out.println("Dia invalido !");
	}
	entrada.close();
}
}
