package Package1;

public class Cuadrado {
	
	public float longitud;
	public float diagonal;
	public float perimetro;
	public float area;
	
	public Cuadrado (float longitud) {
		this.longitud = longitud;
	}
	
	public float getDiagonal() {
		return diagonal = (float) Math.sqrt(2*Math.pow(this.longitud, 2));
	}
	
	public float getPerimetro() {
		return perimetro = this.longitud*4;
	}
	
	public float getArea() {
		return area = this.longitud*this.longitud;
	}

}
