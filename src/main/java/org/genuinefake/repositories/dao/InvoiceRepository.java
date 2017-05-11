package org.genuinefake.repositories.dao;

import org.genuinefake.repositories.InvoiceDetails;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by fnord on 17.5.11.
 */
interface InvoiceRepository extends Repository<InvoiceDetails, Long> {


}
