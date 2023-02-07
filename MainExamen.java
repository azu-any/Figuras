// Azuany Mila - 177068
// Examen Parcial 1

package Package1;

import java.util.Scanner;

public class MainExamen {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido");
		
		while(true) {
			
			System.out.println("Eliga una opcion:");
			System.out.println("1: Capitalizar");
			System.out.println("2: Invertir");
			System.out.println("3: vOcAlEs");
			System.out.println("4: FizzBuzz");
			System.out.println("5: Palindromo");
			System.out.println("6: Salir");
			
			Scanner scan = new Scanner(System.in);
			String option = scan.nextLine();
			
			Examen miExamen = new Examen();
			String words;
			
			switch(option) {
				case "1":
					System.out.println("Escriba algo.");
					words = scan.nextLine();
					System.out.println(miExamen.primeraMayuscula(words) + "\n");
					continue;
					
				case "2":
					words = scan.nextLine();
					System.out.println(miExamen.invertirCadena(words) + "\n");
					continue;
				
				case "3":
					words = scan.nextLine();
					System.out.println(miExamen.vocalesMayuscula(words) + "\n");
					continue;
				
				case "4":
					miExamen.fizzBuzz();
					System.out.println();
					continue;
					
				case "5":
					words = scan.nextLine();
					System.out.println(miExamen.palindromo(words) + "\n");
					continue;
					
				case "6":
					System.out.println("Adios.");
			 		System.exit(0);
			 		break;
					
				default:
					System.out.println("Opcion incorrecta. Ingrese de nuevo su respuesta\n");
					continue;
			}
			
			scan.close();
		}
	}
}
