package Arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTXT {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//instanciando uma entrada de fluxo para o arquivo
		FileInputStream entradaArquivo = 
				new FileInputStream("C:\\Users\\vanes\\git\\repository12\\Arquivos\\src\\Arquivos\\arquivo.txt2");//caminho do arquivo
		
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");// no escaner passando a entrada do arquivo e a codificacao escolhida(utf-8)
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while(lerArquivo.hasNext()) {// enquando tiver proximo 
			
			String linha = lerArquivo.nextLine();// ler proxima linha de arquivo
			
			if(linha!=null && !linha.isEmpty()) {
				
				String[] dados = linha.split("\\;");
				
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
			
			pessoas.add(pessoa);
			}
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
