package O.O_Exemplos;

public class Funcionario {
	
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	
	public void IncreaseSalary(double taxa) {
		this.GrossSalary += this.GrossSalary * taxa/100;
	}
	
	public double NetSalary() {
		return this.GrossSalary - this.Tax;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.Name
				+", Liquid Salary: "+ this.NetSalary();
	}

}
