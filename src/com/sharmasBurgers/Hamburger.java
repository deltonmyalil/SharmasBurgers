package com.sharmasBurgers;

public class Hamburger {
	private String name;
	private String meat;
	private double price;
	private String breadRollType;

	private String addOn1name;
	private double addOn1price;
	private String addOn2name;
	private double addOn2price;
	private String addOn3name;
	private double addOn3price;
	private String addOn4name;
	private double addOn4price;

	public Hamburger(String name, String meat, double price, String breadRollType) {
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollType = breadRollType;
	}

	public void addHambugerAddOn1(String name, double price) {
		this.addOn1name = name;
		this.addOn1price = price;
	}

	public void addHambugerAddOn2(String name, double price) {
		this.addOn2name = name;
		this.addOn2price = price;
	}

	public void addHambugerAddOn3(String name, double price) {
		this.addOn3name = name;
		this.addOn3price = price;
	}

	public void addHambugerAddOn4(String name, double price) {
		this.addOn4name = name;
		this.addOn4price = price;
	}

	public double itemizeHamburger() {
		double hamburgerPrice = this.price;
		System.out.println(this.name + " burger on a " + this.breadRollType + "roll "+ "with "+this.meat + " price is " + this.price);

		if(this.addOn1name!=null) {
			hamburgerPrice += this.addOn1price;
			System.out.println("AddOn "+ addOn1name + "added for an extra "+this.addOn1price+ " price.");
		}
		if(this.addOn2name!=null) {
			hamburgerPrice += this.addOn2price;
			System.out.println("AddOn "+ addOn2name + "added for an extra "+this.addOn2price+ " price.");
		}
		if(this.addOn3name!=null) {
			hamburgerPrice += this.addOn3price;
			System.out.println("AddOn "+ addOn3name + "added for an extra "+this.addOn3price+ " price.");
		}
		if(this.addOn4name!=null) {
			hamburgerPrice += this.addOn4price;
			System.out.println("AddOn "+ addOn4name + "added for an extra "+this.addOn4price+ " price.");
		}

	//needs return here
		return hamburgerPrice;
	}
}
