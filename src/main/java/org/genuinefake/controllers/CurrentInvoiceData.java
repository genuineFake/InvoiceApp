package org.genuinefake.controllers;


import org.genuinefake.repositories.InvoiceDetails;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.io.Serializable;

/**
 * Created by fnord on 17.3.13.
 */
@Component

public class CurrentInvoiceData implements Serializable {
    @Valid
    private InvoiceDetails currentInvoiceDetails;

    @PostConstruct
    public void init() {
        currentInvoiceDetails = new InvoiceDetails();
    }

    public CurrentInvoiceData() {

    }

    public CurrentInvoiceData(InvoiceDetails currentInvoiceDetails) {
        this.currentInvoiceDetails = currentInvoiceDetails;
    }



    public InvoiceDetails getCurrentInvoiceDetails() {
        return currentInvoiceDetails;
    }

    public void setCurrentInvoiceDetails(InvoiceDetails currentInvoiceDetails) {
        this.currentInvoiceDetails = currentInvoiceDetails;
    }
}
