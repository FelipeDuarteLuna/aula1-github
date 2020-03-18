package O.O_Exemplos;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Conta_Bancaria_Main {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int account;
		String name, isThere;
		double depositValue;
		
		System.out.println("Enter Account number: ");
		account = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		name = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n) ?");
		isThere = sc.next();
		
		if(isThere.equalsIgnoreCase("s") || isThere.equalsIgnoreCase("sim")){
			System.out.println();
			System.out.println("Enter initial deposit value: ");
			 depositValue = sc.nextDouble();
		}else {
			 depositValue = 0;
		}
		
		Conta_Bancaria_Construtor  cc = new Conta_Bancaria_Construtor(name, account, depositValue);
		
		System.out.println("Account data: ");
		System.out.println(cc.toString());
		System.out.println();
		
		System.out.println("Enter a deposit value: ");
		depositValue = sc.nextDouble();
		cc.depositValue(depositValue);
		
		System.out.println("Updated account data: ");
		System.out.println(cc.toString());
		System.out.println();
		
		
		System.out.println("Enter a withdraw value: ");
		depositValue = sc.nextDouble();
		cc.withdrawValue(depositValue);
		System.out.println(cc.toString());
	}

}
