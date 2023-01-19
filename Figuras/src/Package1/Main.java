package Package1;

public class Main {

	public static void main(String[] args) {
		
		
		Cuadrado cuadrado1 = new Cuadrado(177068);
		
		Circulo circulo1 = new Circulo(177068);
		
		System.out.println("Cuadrado");
		
		System.out.println("Diagonal: " + cuadrado1.getDiagonal());
		
		System.out.println("Perimetro: " + cuadrado1.getPerimetro());
		
		System.out.println("Area: " + cuadrado1.getArea()+ "\n");
		
		System.out.println("Circulo");
		
		System.out.println("Circunferencia: " + circulo1.getCircunferencia());
		
		System.out.println("Area: " + circulo1.getArea());

	}

}
