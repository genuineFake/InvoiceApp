package org.genuinefake.repositories;


import javax.persistence.*;


/**
 * Created by fnord on 17.3.4.
 */

//@Entity
@Table(name = "INVOICES")
public class InvoiceDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int invoiceId;

    private String date;
    private String company;
    private String recipient;
//    @OneToMany(mappedBy = "invoice")
//    @JoinTable(name = "INVOICE_ITEMS", joinColumns = @JoinColumn(name = "INVOICE_ID"), inverseJoinColumns = @JoinColumn(name = "ITEM_ID"))
//    private Collection<Item> items = new ArrayList<>();




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

}
