package org.genuinefake.controllers;

import org.genuinefake.repositories.InvoiceDetails;
import org.springframework.stereotype.Component;


import java.io.Serializable;
import java.util.List;

/**
 * Created by fnord on 17.3.13.
 */
@Component
public class InvoiceController implements Serializable {

    private CurrentInvoiceData currentInvoice;
    ;


    public String delete(InvoiceDetails invoiceDetails) {

        return "invoices.xhtml?faces-redirect = true";
    }

    public String save() {


        currentInvoice.setCurrentInvoiceDetails(new InvoiceDetails()); // clear the form values

        return "invoices.xhtml";
    }

    public String update(InvoiceDetails invoice) {
        currentInvoice = new CurrentInvoiceData(invoice);
        return "";
    }

    public List<InvoiceDetails> getInvoiceList() {
        return null;
    }

    public CurrentInvoiceData getCurrentInvoice() {
        return currentInvoice;
    }

    public void setCurrentInvoice(CurrentInvoiceData currentInvoice) {
        this.currentInvoice = currentInvoice;
    }

}
