package com.sharmasBurgers;

public class DeluxeBurger extends Hamburger {
	public DeluxeBurger() {
		super("Deluxe", "Sausage and Meat", 100, "white");
		super.addHambugerAddOn1("Chips",10);
		super.addHambugerAddOn2("Coke",25);
	}

	//Preventing any more addons for deluxe burger
	//Override the methods of Hamburger class


	@Override
	public void addHambugerAddOn1(String name, double price) {
		System.out.println("Cant add additional items to deluxe burger");
	}

	@Override
	public void addHambugerAddOn2(String name, double price) {
		System.out.println("Cant add additional items to deluxe burger");
	}

	@Override
	public void addHambugerAddOn3(String name, double price) {
		System.out.println("Cant add additional items to deluxe burger");
	}

	@Override
	public void addHambugerAddOn4(String name, double price) {
		System.out.println("Cant add additional items to deluxe burger");
	}
}
