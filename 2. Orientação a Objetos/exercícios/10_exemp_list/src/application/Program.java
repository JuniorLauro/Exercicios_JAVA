package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Program {

	public static void main(String[] args) {
		
		//Cria uma lista do tipo String, o array serve para implementar a interface com uma classe;
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Anna");
		list.add("John");
		list.add("Angel");
		list.add(0, "Jessie");

		//Imprime o tamanho da lista
		System.out.println(list.size());
		
		//laço for each
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		
		//Localizando Strings na lista;
		System.out.println("Index of Angel: " + list.indexOf("Angel")); // Mostra a posição na lista
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // Se não tem, retorna -1
		
		System.out.println("-----------------");
		
		//Filtrando a lista pelas Strings com inicial digitada;
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		
		//Filtrando a lista pela Primeira String encontrada com a inicial digitada;
		String name = list.stream().filter(x -> x.charAt(0) == 'A' ).findFirst().orElse("Not exist in that list");
		System.out.println(name);
	}

}
