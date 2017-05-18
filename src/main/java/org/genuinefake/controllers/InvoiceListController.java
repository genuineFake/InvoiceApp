package org.genuinefake.controllers;

import org.genuinefake.repositories.InvoiceDetails;
import org.genuinefake.repositories.dao.InvoiceRepository;
import org.genuinefake.scope.ScopeName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by fnord on 17.5.18.
 */
@Component
@Scope(ScopeName.VIEW)
public class InvoiceListController {
    @Autowired
    private InvoiceRepository invoiceRepository;
    private List<InvoiceDetails> invoices;


    public List<InvoiceDetails> getInvoices() {

        return (List<InvoiceDetails>) invoiceRepository.findAll();

    }
}
