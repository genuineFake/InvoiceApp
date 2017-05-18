package org.genuinefake.repositories.dao;

import org.genuinefake.repositories.InvoiceDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;


/**
 * Created by fnord on 17.5.11.
 */
public interface InvoiceRepository extends CrudRepository<InvoiceDetails, Long> {



}
