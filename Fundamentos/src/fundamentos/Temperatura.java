 package fundamentos;

public class Temperatura {
// (F - 32) x 5/9 = C
	public static void main(String[] args){	
	final double ajuste = 32;
	final double multiplicador = 5.0/9.0;
	double toConvert = 20;
	
	toConvert = 86;
	double celsius = (toConvert - ajuste) * multiplicador;
	System.out.println(celsius);
}
}
