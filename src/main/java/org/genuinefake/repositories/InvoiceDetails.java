package org.genuinefake.repositories;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


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
    @JoinColumn(name = "INVOICE_ID", nullable = false)
    private List<Item> itemList = new ArrayList<>();


    public InvoiceDetails() {
    }

    public InvoiceDetails(String date, String company, String recipient) {

        this.date = date;
        this.company = company;
        this.recipient = recipient;

    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int id) {
        this.invoiceId = id;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "INVOICE_DATE")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }


}
