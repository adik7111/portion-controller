package model;

public class Food {

	private String name, store;
	private int calories, servings;
	private double cost;
	
	public Food(String name, String store, int calories, int servings, double cost) {
		this.setName(name); this.setStore(store);
		this.setCalories(calories); this.setServings(servings);
		this.setCost(cost);
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
