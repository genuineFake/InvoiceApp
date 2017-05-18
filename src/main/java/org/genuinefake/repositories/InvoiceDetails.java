package org.genuinefake.repositories;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "INVOICES")
public class InvoiceDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "INVOICE_ID")
    private int invoiceId;
    @Column(name = "DATE")
    private String date;
    @Column(name = "COMPANY")
    private String company;
    @Column(name = "RECIPIENT")
    private String recipient;
    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "INVOICE_ID", nullable = false)
    @JoinColumn(name = "INVOICE_ID")
    private List<Item> itemList = new ArrayList<>();


}
