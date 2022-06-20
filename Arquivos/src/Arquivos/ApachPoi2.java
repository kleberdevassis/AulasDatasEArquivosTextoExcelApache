package Arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachPoi2 {

	public static void main(String[] args) throws IOException {

		FileInputStream entrada = new FileInputStream(
				new File("C:\\Users\\vanes\\git\\repository12\\Arquivos\\src\\Arquivos\\arquivo_excel.xls"));

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);/* prepara a entrada do arquivo excel para ler */
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);/* pega a primeira planilha do nosso arquivo excel */

		Iterator<Row> linhaIterator = planilha.iterator();

		List<Pessoa> pessoas = new ArrayList<>();

		while (linhaIterator.hasNext()) {/* enquanto tiver linha no arquivo excel */
			Row linha = linhaIterator.next(); /* Dados da pessoa na linha */
			Iterator<Cell> celulas = linha.iterator();

			Pessoa pessoa = new Pessoa();

			while (celulas.hasNext()) {/* percorrer as celulas */
				Cell cell = celulas.next();

				switch (cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				}

			} /* fim das celulas da linha */

			pessoas.add(pessoa);

		}

		entrada.close();

		for (Pessoa pessoa : pessoas) {/* Poderia gravar no banco de dados */
			System.out.println(pessoa);
		}

	}

}
