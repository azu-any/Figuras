package Package1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("¿Desea crear un circulo o un cuadrado?");
		Scanner scan = new Scanner(System.in);
		String figura = scan.nextLine();
		
		if (figura.contains("cuadrado")) {
			System.out.println("¿Que largo tiene?");
			String largo = scan.nextLine();
			Double longitud = Double.valueOf(largo);
			Cuadrado cuadrado1 = new Cuadrado(longitud);
			
			System.out.println("¿Que desea obtener la diagonal, perimetro o area?");
			String input = scan.nextLine();
			
			switch(input) {
			
				case "perimetro":
					System.out.println("Perimetro: " + cuadrado1.getPerimetro());
					break;
					
				case "diagonal":
					System.out.println("Diagonal: " + cuadrado1.getDiagonal());
					break;
				
				case "area":
					System.out.println("Area: " + cuadrado1.getArea());
					break;
					
				default:
					System.out.println("No se puede hacer eso.");
					break;
			}
		} else if(figura.contains("circulo")) {
			System.out.println("¿Que radio tiene?");
			String largo = scan.nextLine();
			Double radio = Double.valueOf(largo);
			Circulo circulo1 = new Circulo(radio);
			
			System.out.println("¿Que desea obtener la circunferencia o area?");
			String input = scan.nextLine();
			
			switch(input) {
			
				case "circunferencia":
					System.out.println("Circunferencia: " + circulo1.getCircunferencia());
					break;
					
				case "area":
					System.out.println("Area: " + circulo1.getArea());
					break;
					
				default:
					System.out.println("No se puede hacer eso.");
					break;
			}
		} else {
			System.out.println("No se puede hacer eso.");
		}
		
		scan.close();

	}
	
}
