package com.example.cadent;
import android.os.AsyncTask;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class Scraper extends AsyncTask {
    String school;
    String semester;
    int year;
    URL url;
    PdfReader reader;

    Scraper(String school, String semester, int year){
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
    //TODO:this method takes ina url of a pdf
    String[][] getSchoolDates() throws IOException {
        String schoolDates[][];

        System.out.println("Its inside the getPDFData method\n");
        //TODO: depending on what school the user goes to search that schools website

        url = new URL("https://www.qc.cuny.edu/Academics/SupportPrograms/advising/Documents/FALL%202019%20%20Important%20Academic%20Dates,%2003-19-19.pdf");
        reader = new PdfReader(url.openStream());

        //getting the data from the first page
        String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

       // allocating memory
        schoolDates = new String[textFromPage.length()][];

        String lines[] = textFromPage.split("," );

        //parsing the information to schoolDates array
        for(int i = 0; i < lines.length-2; i++){
            System.out.println(lines[i] + "\n");
//            for(int j = i; j < i+2; j++){
//                schoolDates[i][j] = lines[j]; //saving the data as [[text,date,year]...]
//            }
        }

        reader.close();
        return schoolDates;
    }


    @Override
    protected Object doInBackground(Object[] objects)  {
        try{
            getSchoolDates();
        }catch(Exception IOException){

        }

        return objects;
    }
}
