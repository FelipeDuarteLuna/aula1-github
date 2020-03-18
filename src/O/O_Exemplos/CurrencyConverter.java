package O.O_Exemplos;

public class CurrencyConverter {

	public static final double iof = 6;

	
	
	public static double conversao(double dollar, double quantidade){
		
		return (dollar * quantidade) + (dollar * quantidade) * iof/100 ;
	}
	
	
}
