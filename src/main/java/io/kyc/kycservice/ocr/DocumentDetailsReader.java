package io.kyc.kycservice.ocr;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class DocumentDetailsReader {
    private Tesseract tesseract = new Tesseract();
    public String getDocumentDetails(String filePath) {
        String text = "";
        try{
             tesseract.setDatapath("C:\\Users\\adrian.rascovschi\\Desktop\\kyc-service\\kyc-service\\src\\main\\java\\io\\kyc\\kycservice\\tessdata");
             tesseract.setLanguage("eng");
             text = tesseract.doOCR(new File("C:\\Users\\adrian.rascovschi\\Desktop\\kyc-service\\kyc-service\\src\\main\\resources\\testImages\\bi2013.jpeg"));
        }catch (TesseractException ex){
            ex.printStackTrace();
        }

        return text;
    }
}
