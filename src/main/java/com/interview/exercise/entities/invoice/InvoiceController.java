package com.interview.exercise.entities.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;
}
