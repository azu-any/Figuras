package Package1;

public class Circulo {

	public float radio;
	public float circunferencia;
	public float area;
	
	public Circulo (float radio) {
		this.radio = radio;
	}
	
	public float getCircunferencia() {
		return circunferencia = (float) (2*3.1415*this.radio);
	}
	public float getArea() {
		return area = (float) 3.1415*this.radio*this.radio;
	}

}
