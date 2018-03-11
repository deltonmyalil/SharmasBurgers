package com.sharmasBurgers;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "sausage", 30,"White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHambugerAddOn1("Tomato",5);
        hamburger.addHambugerAddOn2("Onion",3);
        hamburger.addHambugerAddOn3("Cheese",10);
        price = hamburger.itemizeHamburger();
        System.out.println("Total Price is :" + price +"\n\n");

        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 60);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHambugerAddOn1("egg", 6);
        healthyBurger.addHambugerAddOn2("cabbage", 9);
        healthyBurger.addHambugerAddOn3("Lettuce",10);
        healthyBurger.addHambugerAddOn4("Salad",15);
        healthyBurger.addHealthyAddOn1("Diet coke",35);
        price = healthyBurger.itemizeHamburger();
		System.out.println("Total Price is :" + price+ "\n\n");

		DeluxeBurger deluxeBurger = new DeluxeBurger();
		deluxeBurger.addHambugerAddOn1("I desperately need Vegan", 1000);  //Cant to this as we overrode the addHamburgerAddon on DeluxeBurger to say that this cant be done
		deluxeBurger.itemizeHamburger();

    }
}
