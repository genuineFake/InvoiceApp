package org.genuinefake.repositories.dao;

import org.genuinefake.repositories.InvoiceDetails;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by fnord on 17.5.11.
 */
public interface InvoiceRepository extends JpaRepository<InvoiceDetails, Long> {

}
