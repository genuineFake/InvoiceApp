package org.genuinefake.controllers;

import org.genuinefake.repositories.InvoiceDetails;
import org.genuinefake.repositories.dao.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.io.Serializable;
import java.util.List;

/**
 * Created by fnord on 17.3.13.
 */
@Component
public class InvoiceController implements Serializable {

    private InvoiceDetails invoiceDetails;
    @Autowired
    private InvoiceRepository invoiceRepository;


    public String delete(InvoiceDetails invoiceDetails) {
        invoiceRepository.delete(invoiceDetails);

        return "/invoices.xhtml?faces-redirect = true";
    }

    public String save() {
        invoiceRepository.save(invoiceDetails);
        invoiceDetails = new InvoiceDetails();


        return "/invoices.xhtml?faces-redirect = true";
    }

    public String update(InvoiceDetails invoice) {

        return "/invoices.xhtml?faces-redirect = true";
    }

    public List<InvoiceDetails> getInvoiceList() {

        return (List<InvoiceDetails>) invoiceRepository.findAll();
    }


}
