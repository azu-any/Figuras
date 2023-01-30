package Package1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		while (true) {
			
			System.out.println("¿Desea crear un circulo o un cuadrado?");
			System.out.println("Para salir escriba 1.");
			Scanner scan = new Scanner(System.in);
			String opcion = scan.nextLine();
			
			boolean flag = true;
			
			switch(opcion) {
				
				case "cuadrado":
						
					System.out.println("¿Que largo tiene?");
								
					while (scan.hasNext()) {
						if(scan.hasNextDouble()) {
							break;
						} else {
							System.out.println("Ingresa un valor numerico.");
							scan.nextLine();
							continue;
						}
					}
						
					String largo = scan.nextLine();
					Double longitud = Double.valueOf(largo);
					Cuadrado cuadrado1 = new Cuadrado(longitud);
						
					while (flag) {
						System.out.println("¿Que desea obtener la diagonal, perimetro o area?");
						String input = scan.nextLine();
			
						switch(input) {
		
							case "perimetro":
								System.out.println("Perimetro: " + cuadrado1.getPerimetro() + "\n");
								flag = false;
								break;
					
							case "diagonal":
								System.out.println("Diagonal: " + cuadrado1.getDiagonal() + "\n");
								flag = false;
								break;
			
							case "area":
								System.out.println("Area: " + cuadrado1.getArea() + "\n");
								flag = false;
								break;
				
							default:
								System.out.println("No se puede hacer eso. Eliga otra opcion.\n");
								continue;
						}
					}
				continue;
						
			 	case "circulo":
	
			 		System.out.println("¿Que radio tiene?");
			 		
			 		while (scan.hasNext()) {
						if(scan.hasNextDouble()) {
							break;
						} else {
							System.out.println("Ingresa un valor numerico.");
							scan.nextLine();
							continue;
						}
					}
			 			
				 	String largo2 = scan.nextLine();
				 	Double radio = Double.valueOf(largo2);
				 	Circulo circulo1 = new Circulo(radio);
				 	
				 	while(flag) {
					
				 		System.out.println("¿Que desea obtener la circunferencia o area?");
				 		String input2 = scan.nextLine();
			
			 			switch(input2) {
			
			 				case "circunferencia":
			 					System.out.println("Circunferencia: " + circulo1.getCircunferencia() + "\n");
			 					flag = false;
			 					break;
					
			 			case "area":
			 					System.out.println("Area: " + circulo1.getArea() + "\n");
			 					flag = false;
			 					break;
					
			 			default:
			 					System.out.println("No se puede hacer eso. Eliga otra opcion.\n");
			 					continue;
			 			}
			 		}
				 continue;
			 		
			 	case "1":
			 		System.out.println("Adios.");
			 		System.exit(0);
			 		break;
			 	
			 	default:
			 		System.out.println("Opcion incorrecta. Ingrese de nuveo su respuesta");
			 		continue;
			}
		
			scan.close();
		}
	}
}