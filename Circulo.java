package Package1;

public class Circulo {

	public double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public Circulo() {
		this(177068);
	}
	
	public double getCircunferencia() {
		return (double) (2*3.1415*this.radio);
	}
	public double getArea() {
		return (double) 3.1415*this.radio*this.radio;
	}
}
