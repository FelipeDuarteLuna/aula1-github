package Vector_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exer_Func_main {
	public static void main(String[]main) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		int id,cont;
		String name;
		double salary = 0, porcent;
		List<Funcionario> list = new ArrayList<Funcionario>();
				
		
		System.out.println("How many employees will be registered ?");
		cont = sc.nextInt();
		
		for(int i = 0; i<cont ; i++) {
			System.out.println();
			System.out.println("Tamanho da Lista:  " + list.size());
			
			System.out.println("Emplyoee #"+ i );
			System.out.println("Id: ");
			id = sc.nextInt();
		
			System.out.println("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			
			System.out.println("Salary: ");
			salary = sc.nextDouble();
			
			list.add(new Funcionario(id, name, salary));
			
		}
		
		for(Funcionario x : list) {
			System.out.println(x.toString());
		}
				
		System.out.println("Enter the employee id that will have salary increase: ");
		int id2 = sc.nextInt();
		
		//List <Funcionario> result = list.stream().filter(A -> A.getId()	== 222).collect(Collectors.toList());
		//Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		Funcionario result = list.stream().filter(A -> A.getId() == id2).findFirst().orElse(null);
		
		if(result == null) {
			System.out.println("This Id does not exist !");
		}else {
			System.out.println("Enter the percentage: ");
			porcent = sc.nextDouble();
			result.aumentaSalary(porcent);
			
		}

		
		for(Funcionario x : list) {
			System.out.println(x.toString());
		}
	}

}
