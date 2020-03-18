package Vector_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas_funcoes_relacionadas {
	public static void main(String[]args) {
		
		List<String> list = new ArrayList<>();	
		
		list.add("Maria");
		list.add("Alex"); // Adicionando valores a lista
		list.add("Bob");
		list.add("Anna");
		
		list.add(2, "Renan"); // Adicionando valores manualmente em determinadas posições.
		
		System.out.println(list.size()); // Para saber o tamanho da lista
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------Remoção -------------------");
		list.remove(4); // Removendo da Lista, posição 1
		list.remove("Alex"); // Removendo da lista, Valores com conteudo igual Alex
		list.removeIf(x -> x.charAt(0) == 'B');
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------Pesquisando pelas Listas -------------------");
		System.out.println("Index of Marco: "+ list.indexOf("Renan"));
		
		System.out.println("---------------Gerando uma nova lista, devido a filtragem. -------------------");
		List <String> result = list.stream().filter(A -> A.charAt(0) == 'M').collect(Collectors.toList());
		for(String r : result) {
			System.out.println(r);
		}
		
		
		
	}

}
