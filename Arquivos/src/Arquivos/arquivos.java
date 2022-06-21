package Arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class arquivos {
	
	public static void main(String[] args) throws IOException {
		
		
		Pessoa pessoa1  = new Pessoa();
		pessoa1.setEmail("pessoa@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("Alex egidio");
		
		Pessoa pessoa2  = new Pessoa();
		pessoa2.setEmail("carlos@gmail.com");
		pessoa2.setIdade(30);
		pessoa2.setNome("Carlos egidio");
		
		Pessoa pessoa3  = new Pessoa();
		pessoa3.setEmail("Fatima@gmail.com");
		pessoa3.setIdade(30);
		pessoa3.setNome("Fatima egidio");
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoa3);
		pessoas.add(pessoa2);
		pessoas.add(pessoa1);
		
		
		File arquivo = new File("C:\\Users\\vanes\\git\\repository12\\Arquivos\\src\\Arquivos\\arquivo.csv");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {
		escrever_no_arquivo.write(p.getNome()+ ";"+ p.getEmail()+ ";"+ p.getIdade()+ "\n");
		}
		
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}

}
