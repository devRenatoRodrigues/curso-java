package controles;

public class DesafioFor {
public static void main(String[] args) {
	
	String valor = "######";
	String user = "#";
	for (int i = user.length(); i <= valor.length(); i++) {
System.out.println(user);
user += "#";
		
	}
	
	for (String i = "#"; !i.equals("######"); i+= "#") {
		System.out.println(i);
	}
}
}
