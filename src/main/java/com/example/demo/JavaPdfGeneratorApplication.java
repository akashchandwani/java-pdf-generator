package com.example.demo;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class JavaPdfGeneratorApplication {

	public static void main(String[] args) throws IOException, DocumentException {
		PdfReader reader;
		PdfStamper stamper;
		AcroFields form;
		reader = new PdfReader("Untitled.pdf");
		stamper = new PdfStamper(reader, new FileOutputStream("Untitled-Modified.pdf"));
		form = stamper.getAcroFields();
		form.setField("box-1", "Hi there !");
		stamper.setFormFlattening(true);
		stamper.close();
	}

}
