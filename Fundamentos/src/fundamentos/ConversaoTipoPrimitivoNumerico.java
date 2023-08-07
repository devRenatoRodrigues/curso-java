package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
public static void main(String[] args) {
	double a = 1.1151558488;// Implícita
	System.out.println(a);
	
	float b = (float) 1.12345;// explicíta (CAST)
	System.out.println(b);
	
	int c = 260;
	byte d = (byte) c; // explicíta (CAST)
	System.out.println(d);
	
	double e = 1.999;
	int f = (int) e; // explicíta (CAST)
	System.out.println(f);
	
}
}
