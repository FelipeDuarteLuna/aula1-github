package O.O_Exemplos;

public class Conta_Bancaria_Construtor {
	//Declarando variavéis
	private String name;
	private int account;
	private double valueSaldo;
	
	
	public Conta_Bancaria_Construtor(String name, int account, double valueSaldo) {
		this.name = name;
		this.account = account;
		this.valueSaldo = valueSaldo;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAccount() {
		return this.account;
	}
	
	public double getValueSaldo() {
		return this.valueSaldo;
	}
	
	public void depositValue(double depositValue) {
		 this.valueSaldo += depositValue;
	}
	
	public void withdrawValue (double withdrawValue) {
		this.valueSaldo -= withdrawValue + 5;
	}
	
	
	public String toString() {
		// 
		return "Account " +
				this.getAccount()
				+", "
				+"Holder: "
				+ this.getName()
				+", Balance: $"
				+ String.format("%.2f", this.getValueSaldo());
	}
	
	
}
