
import java.util.Scanner;

public class holaMundo {
	public static void main(String [] args) {
		System.out.println("Hola Mundo!");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su nombre.");
		String nombre = scan.next();
		
		System.out.println("Bienvenido(a) al curso "+nombre+"!");
		scan.close();
	}

}
