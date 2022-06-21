package Arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("C:\\Users\\vanes\\git\\repository12\\Arquivos\\src\\Arquivos\\arquivo_excel.xls");
		
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
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de pessoas Jdev Treinamento");
		
		int numeroLinha = 0;
		for (Pessoa p: pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha++);
			
			int celula = 0;
			
			Cell celNome = linha.createCell(celula++);
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula++);
			celNome.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula++);
			celNome.setCellValue(p.getIdade());
			
			FileOutputStream saida = new FileOutputStream(file);
			hssfWorkbook.write(saida);
			
			saida.flush();
			saida.close();
		}
		
	}
	
}
