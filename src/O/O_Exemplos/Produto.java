package O.O_Exemplos;

public class Produto {
	
	public String nome;
	public double price;
	public int quantity;
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public int addProducts(int quantidade) {
		return this.quantity += quantidade;
	}
	
	public int removeProducts(int quantidade) {
		return this.quantity -= quantidade;
	}
	
	public String toString() {
		
		return this.nome 
				+ " , $ "
				+String.format("%.2f", price)
				+", "
				+this.quantity
				+ " units, Total: $ "
				+ String.format("%.2f", this.totalValueInStock());
	}
}
