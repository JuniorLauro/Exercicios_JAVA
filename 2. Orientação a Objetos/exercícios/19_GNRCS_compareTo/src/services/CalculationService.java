package services;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<? super T>> T max(List<T> list) {
		
		//Verifica se a lista tem algum conteúdo;
		if(list.isEmpty()) {
			throw new IllegalStateException("List can't be empy!");
		}
		
		//Cria um variavel genérica do tipo T e atribui o primeiro elemento da lista;
		T max = list.get(0);
		
		//Varre a lista T e compara com o valor max, se for o item for maior que max, max recebe o conteudo;
		for(T item: list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
		
	}
	
	public static <T extends Comparable<? super T>> T min(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("List can't be empy!");
		}
		
		T min = list.get(0);
		for(T item: list) {
			if(item.compareTo(min) < 0) {
				min = item;
			}
		}
		return min;
	}
}
