package O.O_Exemplos;

public class Aluno {

	public String Nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double notaTotal;
	
	public double totalNotas() {
		this.notaTotal = this.nota1 + this.nota2 + this.nota3;
		System.out.println("Final GRADE =" + this.notaTotal);
		if(this.notaTotal > 60) {
			System.out.println("Aluno Aprovado -- PASS");
		}else {
			System.out.println("Aluno Reprovado -- Failed");
			System.out.print( "Missing ");
			System.out.println(60 - this.notaTotal +" Points" );
		}
		
		return this.nota1 + this.nota2 + this.nota3;
	}
	
	
}
