package Package1;

public class Cuadrado {
	
	public double longitud;
	
	
	public Cuadrado(double longitud) {
		this.longitud = longitud;
	}
	
	public Cuadrado() {
		this(177068);
	}
	
	public double getDiagonal() {
		return (double) Math.sqrt(2*(this.longitud*this.longitud));
	}
	
	public double getPerimetro() {
		return this.longitud*4;
	}
	
	public double getArea() {
		return this.longitud*this.longitud;
	}
}
