package io.kyc.kycservice.reportfactory;

import io.kyc.kycservice.ocr.DocumentDetailsReader;
import lombok.*;
import net.sourceforge.tess4j.TesseractException;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ReportFactory {
    private String videoPath;
    private String faceImagePath;
    private String documentFrontViewPath;
    private String documentBackViewPath;
    private final String reportTemplatePath = "";
    private double faceSimilarity;
    private Document documentDetails;

    public void createReport(){
        
    }
    public Document getDocument() throws TesseractException {
        DocumentDetailsReader documentDetailsReader = new DocumentDetailsReader();
        String documentInfo = documentDetailsReader.getDocumentDetails("bi2013.jpeg");
        return  null;
    }
}
