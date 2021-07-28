/**
 * 
 */
package com.pizzashop.server;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * @author Danny Kovene
 *
 */
@Service
public class OpenCSVReadAndParseToBean {

	private static final String CSV_FILE_PATH = "./Sr._Java_Developer_Testing-_Ingredients.csv";

	/**
	 * 
	 */
	public OpenCSVReadAndParseToBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		try (Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));) {
			CsvToBean<Ingrediants> csvToBean = new CsvToBeanBuilder<Ingrediants>(reader).withType(Ingrediants.class)
					.withIgnoreLeadingWhiteSpace(true).build();

			Iterator<Ingrediants> ingrediantsIterator = csvToBean.iterator();

			while (ingrediantsIterator.hasNext()) {
				Ingrediants ingrediant = ingrediantsIterator.next();
				System.out.println("Ingrediant : " + ingrediant.getIngredient());
				System.out.println("Quantity : " + ingrediant.getQuantity());
				System.out.println("==========================");
			}
		}
	}

}
