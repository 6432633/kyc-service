package io.kyc.kycservice.controllers;

import io.kyc.kycservice.reportfactory.Document;
import io.kyc.kycservice.reportfactory.ReportFactory;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/t")
    public void getDocumentDetails() throws TesseractException {
        ReportFactory reportFactory = new ReportFactory();
        Document document = reportFactory.getDocument();
    }
}
