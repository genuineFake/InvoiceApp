package org.genuinefake.controllers;

import org.genuinefake.repositories.InvoiceDetails;
import org.springframework.stereotype.Component;


/**
 * Created by fnord on 17.3.14.
 */

@Component
public class addNewInvoice {


    private InvoiceDetails newInvoiceDetails = new InvoiceDetails();


    public String addNew() {


        return "invoices.xhtml?faces-redirect = true";
    }


    public InvoiceDetails getNewInvoiceDetails() {
        return newInvoiceDetails;
    }

    public void setNewInvoiceDetails(InvoiceDetails newInvoiceDetails) {
        this.newInvoiceDetails = newInvoiceDetails;
    }

}






