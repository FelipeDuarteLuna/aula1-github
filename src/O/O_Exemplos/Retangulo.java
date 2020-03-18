package O.O_Exemplos;

public class Retangulo {
	
	public double width;
	public double height;
	private double Area;
	private double Perimetro;
	
	
	//Funções das classes
	public double Area(double largura, double altura) {
		Area = this.width * this.height;
		return Area;
	}
	
	
	public double Perimeter(double largura, double altura) {
		Perimetro = (this.width + this.height) *2; 
		return Perimetro;
	}
	
	
	public double Diagonal() {
		return Math.sqrt(width * width + height * height);
	}
	
	@Override
	public String toString() {
		
		return " Altura " + this.height
		+", Largura " + this.width
		+", Area do Retangulo " + this.Area
		+", Perimetro " + this.Perimetro
		+", Diagonal " + this.Diagonal();
	}
}
