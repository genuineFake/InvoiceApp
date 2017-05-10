package org.genuinefake.repositories;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by fnord on 17.3.4.
 */
//@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;
    private String name;
    private int amount;
    private int price;
    private String units;

    private InvoiceDetails invoice;


    public Item() {
    }

    public Item(String name, int amount, int price, String units) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String toString() {
        return name + " , " + amount + " , " + price + " , " + units;
    }
}
