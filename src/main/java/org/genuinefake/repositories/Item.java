package org.genuinefake.repositories;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ITEMS")
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ITEM_ID")
    private int itemId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "AMOUNT")
    private int amount;
    @Column(name = "PRICE")
    private int price;
    @Column(name = "UNITS")
    private String units;


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

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }


}
