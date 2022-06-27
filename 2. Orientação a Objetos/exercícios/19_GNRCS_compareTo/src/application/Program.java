package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Criando lista de Produtos;
		List<Product> list = new ArrayList<>();

		//Caminho do arquivo .csv;
		String path = "C:\\ws-eclipse\\in.csv";
		
		//Iniciando Leitura do Arquivo;
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			//Enquanto tiver conteúdo, faça...
			while(line != null) {
				
				//Cria um vetor de String e separa as informações contidas por ",";
				String[] vect = line.split(",");
				
				//Criando um Produto sendo nome, preço(necessario converter de String para Double);
				list.add(new Product(vect[0], Double.parseDouble(vect[1])));
				
				//Realiza mais uma leitura para verificar se existe algo, ou o while fica em loop;
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			Product x2 = CalculationService.min(list);
			System.out.println("Most expensive: " + x);
			System.out.println("Most cheap: " + x2);
			
		}
		catch(IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
