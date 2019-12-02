package com.example.cadent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{

            System.out.println("Dates will show up here \n");
            Log.d("creation", "Dates will show up here\n");
            new Scraper("Queens College", "fall", 2019).execute();

        }catch(Exception IOException){
            System.out.println(IOException);
        }

    }
}
