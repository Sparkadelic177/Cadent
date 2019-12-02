package com.example.cadent;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class scraper {
    String school;
    String semester;
    int year;
    URL url;
    PdfReader reader;

    scraper(String school, String semester, int year){
        this.school = school;
        this.semester = semester;
        this.year = year;
    }


    //TODO: this method will retrieve the users semster data
    //TODO: if pdf do something, if html do something else
    URL getSemesterUrl(){

        return url;
    }

    //this method returns the school dates scraped in the web in a pdf
    String[][] getPDFData(URL schoolUrl) throws MalformedURLException, IOException {
        String schoolDates[][];

        //TODO: depending on what school the user goes to search that schools website
        URL url = new URL("https://www.qc.cuny.edu/Academics/SupportPrograms/advising/Documents/FALL%202019%20%20Important%20Academic%20Dates,%2003-19-19.pdf");
        reader = new PdfReader(url);

        return schoolDates;
    }


}
