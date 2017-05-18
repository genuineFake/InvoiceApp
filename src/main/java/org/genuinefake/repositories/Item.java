package org.genuinefake.repositories;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Data
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

}
