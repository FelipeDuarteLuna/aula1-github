package Vector_Array;

public class Funcionario {
	
	int id;
	String name;
	double salary;
	
	//Declarando o Construtor
	public Funcionario(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
		
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	// Declaração dos Gett's e Sett's, encapsulamento
	public void setId(int id){
		this.id =id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salario) {
		this.salary = salario;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void aumentaSalary(double percentual) {
		this.salary += (this.salary * percentual /100);
	}
	
	@Override
	public String toString() {
		return this.getId() +", "
				+ this.getName() +", "
				+this.getSalary() +" ..!";
	}
}
