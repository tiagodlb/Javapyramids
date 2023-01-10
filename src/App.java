import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        
        int numero = scan.nextInt();
		Piramide Piramide = new Piramide();
        Piramide.criaPiramide(numero);
	}

}