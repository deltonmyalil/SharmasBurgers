package com.sharmasBurgers;

public class HealthyBurger extends Hamburger {
	private String healthyAddOn1;
	private double healthyAddOn1price;
	private String healthyAddOn2;
	private double healthyAddOn2price;

	public HealthyBurger(String meat, double price) {
		super("Healthy", meat, price, "SugarFree Brown roll");
	}

	public void addHealthyAddOn1(String name, double price) {
		this.healthyAddOn1 = name;
		this.healthyAddOn1price = price;
	}

	public void addHealthyAddOn2(String name, double price) {
		this.healthyAddOn2 = name;
		this.healthyAddOn2price = price;
	}

	@Override
	public double itemizeHamburger() {
		double hamburgerPrice = super.itemizeHamburger();  //This calls the parent method and gets the default upto 4 addons
		if(this.healthyAddOn1!= null) {
			hamburgerPrice += this.healthyAddOn1price;
			System.out.println("Healthy AddOn "+ healthyAddOn1 + "added for an extra "+this.healthyAddOn1price+ " price.");
		}
		if(this.healthyAddOn2!= null) {
			hamburgerPrice += this.healthyAddOn2price;
			System.out.println("Healthy AddOn "+ healthyAddOn2 + "added for an extra "+this.healthyAddOn2price+ " price.");
		}
		return hamburgerPrice;
	}
}
