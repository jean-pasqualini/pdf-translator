package com.company;

import com.aspose.pdf.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        Document pdfDocument = new Document("/home/darkilliant/Bureau/the-pragmatic-programmer.pdf");


        TextAbsorber textAbsorber = new TextAbsorber();


        pdfDocument.getPages().get_Item(3).accept(textAbsorber);

        // Get the extracted text
        String extractedText = textAbsorber.getText();

        try {
            // Create a writer and open the file
            java.io.FileWriter writer = new java.io.FileWriter(new java.io.File("/tmp/pdf.txt"));
            writer.write(extractedText);

// Write a line of text to the file tw.WriteLine(extractedText);
// Close the stream
            writer.close();

        } catch (Exception ex) {

        }



        /**
        // Create TextAbsorber object to find all instances of the input search phrase
        TextFragmentAbsorber textFragmentAbsorber = new TextFragmentAbsorber();

// Accept the absorber for first page of document
        pdfDocument.getPages().accept(textFragmentAbsorber);




// Get the extracted text fragments into collection
        TextFragmentCollection textFragmentCollection = textFragmentAbsorber.getTextFragments();

// Loop through the fragments
        for (TextFragment textFragment : (Iterable<TextFragment>) textFragmentCollection) {
            System.out.println("out: " + textFragment.getText());
            // Update text and other properties
            //textFragment.setText("Pourquoi");
        }
// Save the updated PDF file
      //  pdfDocument.save("/tmp/pdf.pdf");
*/
    }
}
