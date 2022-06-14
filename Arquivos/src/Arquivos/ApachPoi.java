package Arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachPoi {
	
	public static void main(String[] args) throws IOException {
		
		
		File file = new File("C:\\Users\\vanes\\git\\repository12\\Arquivos\\src\\Arquivos\\arquivo_excel.xls");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
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
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();/*vai ser usado para escrever a planilha*/
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de pessoas Jdev Treinamento");/*criar planilha*/
		
		int numeroLinha = 0;
		for(Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha++);/*criando a linha da planilha*/
			
			int celula = 0;
			
			Cell celNome = linha.createCell(celula++);/*Celular 1*/
			celNome.setCellValue(p.getNome());
			
			Cell celemail = linha.createCell(celula++);/*Celular 2*/
			celemail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula++);/*Celular 3*/
			celIdade.setCellValue(p.getIdade());
			
		}/*Termina de montar a planilha*/
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);/*Escreva a planilha em arquivo*/
		saida.flush();
		saida.close();
		
		System.out.println("Planilha foi criada");
		
		
	}

}
