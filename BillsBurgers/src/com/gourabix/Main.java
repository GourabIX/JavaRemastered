package com.gourabix;

class Hamburger {

    private String breadRollType;
    private boolean hasMeat;
    private boolean lettuceAddOn;
    private boolean tomatoAddOn;
    private boolean carrotAddOn;
    private boolean cheeseAddOn;
    private double price;
    private String burgerName;

    public Hamburger(String breadRollType, boolean hasMeat, String burgerName) {
        this.breadRollType = breadRollType;
        this.hasMeat = hasMeat;
        this.burgerName = burgerName;
        this.price = 5.50;
        this.tomatoAddOn = false;
        this.carrotAddOn = false;
        this.cheeseAddOn = false;
        this.lettuceAddOn = false;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public boolean isHasMeat() {
        return hasMeat;
    }

    public void setHasMeat(boolean hasMeat) {
        this.hasMeat = hasMeat;
    }

    public boolean isLettuceAddOn() {
        return lettuceAddOn;
    }

    public void setLettuceAddOn(boolean lettuceAddOn) {
        this.lettuceAddOn = lettuceAddOn;
    }

    public boolean isTomatoAddOn() {
        return tomatoAddOn;
    }

    public void setTomatoAddOn(boolean tomatoAddOn) {
        this.tomatoAddOn = tomatoAddOn;
    }

    public boolean isCarrotAddOn() {
        return carrotAddOn;
    }

    public void setCarrotAddOn(boolean carrotAddOn) {
        this.carrotAddOn = carrotAddOn;
    }

    public boolean isCheeseAddOn() {
        return cheeseAddOn;
    }

    public void setCheeseAddOn(boolean cheeseAddOn) {
        this.cheeseAddOn = cheeseAddOn;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int calculateAddOnItems() {
        int totalAddOns = 0;

        if (lettuceAddOn) {
            totalAddOns++;
        }

        if (tomatoAddOn) {
            totalAddOns++;
        }

        if (cheeseAddOn) {
            totalAddOns++;
        }

        if (carrotAddOn) {
            totalAddOns++;
        }

        return totalAddOns;
    }

    public double calculateBillAmount() {

        if (lettuceAddOn) {
            price += 0.5;
        }

        if (tomatoAddOn) {
            price += 0.5;
        }

        if (cheeseAddOn) {
            price += 0.75;
        }

        if (carrotAddOn) {
            price += 0.35;
        }

        return price;

    }

    public void generateItemsForInvoice() {

        int addOnItems = calculateAddOnItems();

        System.out.println("--------------------------------------------------------------");
        System.out.println("ORDER: " + getBurgerName().toUpperCase());
        System.out.println("--------------------------------------------------------------");
        System.out.println("Base Amount: " + "\t\t\t 5.50");
        if (getClass().getSimpleName().equals("HealthyBurger")) {
            System.out.println("Customization -> Healthy Base: \t\t 2.75");
        }
        System.out.println("Total Addon Items: " + "\t\t\t " + addOnItems);

        if(lettuceAddOn) {
            System.out.println("Lettuce Add On: " + "\t\t\t 0.50");
        }

        if (tomatoAddOn) {
            System.out.println("Tomato Add On: " + "\t\t\t 0.50");
        }

        if (cheeseAddOn) {
            System.out.println("Cheese Add On: " + "\t\t\t 0.75");
        }

        if (carrotAddOn) {
            System.out.println("Carrot Add On: " + "\t\t\t 0.35");
        }

    }

    public void generateInvoiceAmount() {

        double price = calculateBillAmount();
        System.out.println("--------------------------------------------------------------");
        System.out.println("GRAND TOTAL: " + price);
        System.out.println("--------------------------------------------------------------");

    }

    public void generateThanksMessage() {
        System.out.println("Thanks for having your meal at Bill's Burger! We hope to see you again.");
    }

    public void generateCompleteInvoice() {
        generateItemsForInvoice();
        generateInvoiceAmount();
        generateThanksMessage();
    }

}

class HealthyBurger extends Hamburger {

    private boolean mixedVegAddOn;
    private boolean saladAddOn;

    public HealthyBurger(boolean hasMeat, String burgerName, boolean mixedVegAddOn, boolean saladAddOn) {
        super("Brown Rye Bread Roll", hasMeat, burgerName);
        this.mixedVegAddOn = mixedVegAddOn;
        this.saladAddOn = saladAddOn;
    }

    public boolean isMixedVegAddOn() {
        return mixedVegAddOn;
    }

    public void setMixedVegAddOn(boolean mixedVegAddOn) {
        this.mixedVegAddOn = mixedVegAddOn;
    }

    public boolean isSaladAddOn() {
        return saladAddOn;
    }

    public void setSaladAddOn(boolean saladAddOn) {
        this.saladAddOn = saladAddOn;
    }

    @Override
    public int calculateAddOnItems() {

        int addOnItems = super.calculateAddOnItems();

        if (mixedVegAddOn) {
            addOnItems++;
        }

        if (saladAddOn) {
            addOnItems++;
        }

        return addOnItems;

    }

    @Override
    public double calculateBillAmount() {

        double price = super.calculateBillAmount() + 2.75;          // add cost for healthy bread roll

        if (mixedVegAddOn) {
            price += 1.75;
        }

        if (saladAddOn) {
            price += 1.50;
        }

        setPrice(price);
        return price;

    }

    @Override
    public void generateItemsForInvoice() {

        super.generateItemsForInvoice();

        if (mixedVegAddOn) {
            System.out.println("Mixed Veg Add On: \t\t\t 1.75");
        }

        if (saladAddOn) {
            System.out.println("Salad Add On: \t\t\t 1.50");
        }

    }

}

class DlxHamburger extends Hamburger {

    private boolean chipsAddOn;
    private boolean cokeAddOn;

    public DlxHamburger(boolean hasMeat, String burgerName) {
        super("Extra Cheese Burst Bread Roll", hasMeat, burgerName);
        super.setCarrotAddOn(false);
        super.setCheeseAddOn(false);
        super.setLettuceAddOn(false);
        super.setTomatoAddOn((false));
        chipsAddOn = true;
        cokeAddOn = true;
    }

    // Prevent other add-ons from being added to the deluxe burger

    @Override
    public void setLettuceAddOn(boolean lettuceAddOn) {
        System.out.println("Cannot add any other add-ons to the Deluxe Hamburger!");
    }

    @Override
    public void setTomatoAddOn(boolean tomatoAddOn) {
        System.out.println("Cannot add any other add-ons to the Deluxe Hamburger!");
    }

    @Override
    public void setCarrotAddOn(boolean carrotAddOn) {
        System.out.println("Cannot add any other add-ons to the Deluxe Hamburger!");
    }

    @Override
    public void setCheeseAddOn(boolean cheeseAddOn) {
        System.out.println("Cannot add any other add-ons to the Deluxe Hamburger!");
    }

    @Override
    public double calculateBillAmount() {
        return getPrice() + 3.75 + 5.50 + 7.50;        // add cost for extra cheese burst bread roll, coke and chips
    }

    @Override
    public int calculateAddOnItems() {
        return 2;
    }

    @Override
    public void generateCompleteInvoice() {
        double baseAmount = getPrice() + 3.75;
        System.out.println("--------------------------------------------------------------");
        System.out.println("ORDER: " + getBurgerName().toUpperCase());
        System.out.println("--------------------------------------------------------------");
        System.out.println("Base Amount: " + "\t\t\t " + baseAmount);
        System.out.println("Total Addon Items: " + "\t\t\t " + calculateAddOnItems());
        System.out.println("Coke Add On: \t\t\t" + 7.50);
        System.out.println("Chips Add On: \t\t\t" + 5.50);
        System.out.println("--------------------------------------------------------------");
        System.out.println("GRAND TOTAL: \t\t\t" + calculateBillAmount());
        System.out.println("--------------------------------------------------------------");
        generateThanksMessage();
    }
}

public class Main {

    public static void main(String[] args) {

        DlxHamburger dlxHamburger = new DlxHamburger(true, "Deluxe Hamburger with Coke and Chips");
        dlxHamburger.setCheeseAddOn(true);
        dlxHamburger.generateCompleteInvoice();

        System.out.println();

        Hamburger hamburger = new Hamburger("Normal", false, "Good Ol' Hamburger");
        hamburger.setCheeseAddOn(true);
        hamburger.setTomatoAddOn(true);
        hamburger.generateCompleteInvoice();

        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger(true, "Healthy Burger", true,
                                                    true);
        healthyBurger.setCheeseAddOn(true);
        healthyBurger.generateCompleteInvoice();

    }
}
