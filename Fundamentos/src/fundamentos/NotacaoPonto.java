package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "Vai Palestra !!!";
		s = s.replace("Palestra", "Palmeiras");
		s = s.toUpperCase();
		s = s.concat("!!!");	
		System.out.println(s);
		
		String x = "Renato Oliveira"
				.toUpperCase()
				.replace("RENATO", "Serena ")
				.toLowerCase()
				.concat(s);
		System.out.println(x);
		//Tipos primitivos não tem operador '.'
		int i = 3;
		System.out.println(i);
	}
}
