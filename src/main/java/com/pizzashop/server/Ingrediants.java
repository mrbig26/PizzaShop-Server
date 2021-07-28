/**
 * 
 */
package com.pizzashop.server;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvNumber;

/**
 * @author Danny Kovene
 *
 */
public class Ingrediants {

	@CsvBindByName
	private String ingredient;
	@CsvBindByName
	@CsvNumber("#")
	private int quantity;

	/**
	 * 
	 */
	public Ingrediants() {
	}

	/**
	 * 
	 */
	public Ingrediants(String ingredient, int quantity) {
		this.ingredient = ingredient;
		this.quantity = quantity;
	}

	/**
	 * @return the ingredient
	 */
	public String getIngredient() {
		return ingredient;
	}

	/**
	 * @param ingredient the ingredient to set
	 */
	public void setIngrediant(String ingredient) {
		this.ingredient = ingredient;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
