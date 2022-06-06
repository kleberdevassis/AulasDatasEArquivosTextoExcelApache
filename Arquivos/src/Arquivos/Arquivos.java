package Arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
	
	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();   // instanciar os objetos
		pessoa1.setEmail("pessoa@gmail.com");// setar os atributos
		pessoa1.setIdade(50);
		pessoa1.setNome("alex egidio");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("dados@gmail.com");
		pessoa2.setIdade(80);
		pessoa2.setNome("Maria");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("homem@gmail.com");
		pessoa3.setIdade(58);
		pessoa3.setNome("Carlos");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();// criar lista e adicionar as variaveis ja com os atributos setados
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		// criar novo endereço de arquivo
		File arquivo = new File("C:\\Users\\vanes\\git\\repository12\\Arquivos\\src\\Arquivos\\arquivo.txt2");
		
		if(!arquivo.exists()) {// se arquivo não existir criar novo arquivo
			arquivo.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);// instanciar classe que escreve em arquivos e colocar o arquivo como parametro
		
		
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome()+";"+ p.getEmail()+";"+p.getIdade()+"\n");// forEach para escrever no arquivo com os atributos do objeto
		}
		
		escrever_no_arquivo.flush(); // da descarga no fluxo
		escrever_no_arquivo.close(); // fecha
		
	}

}
