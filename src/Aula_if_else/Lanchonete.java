package Aula_if_else;
import java.util.Scanner;

public class Lanchonete {
	public static void main (String[]args) {
		
		int codigo,quantidade;
		double valor;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o código do lanche desejado: ");
		codigo = sc.nextInt();
		
		System.out.println("Informe a quantidade do lanche desejado: ");
		quantidade = sc.nextInt();
		
		if(codigo == 1){
			valor = quantidade *4 ;
			System.out.println("Você pediu " + quantidade +" Cachorrro Quente." + "Total R$ " + valor); 
		}else if(codigo == 2) {
			valor = quantidade *4.50 ; 
			System.out.println("Você pediu " + quantidade +" X-Salada" + "Total R$ " + valor);
		}else if(codigo == 3) {
			valor = quantidade *5.00 ;
			System.out.println("Você pediu " + quantidade +" X-Bacon" + "Total R$ " + valor);
		}else if(codigo == 4) {
			valor = quantidade *2.00 ;
			System.out.println("Você pediu " + quantidade +" Torrada Simples" + "Total R$ " + valor);
		}else if(codigo == 5) {
			valor = quantidade *1.50 ;
			System.out.println("Você pediu " + quantidade +" Refrigerante" + "Total R$ " + valor);
		}else {
			System.out.println("Código de lanche não cadastrado no sistem. !");
		}
		
	}

}
