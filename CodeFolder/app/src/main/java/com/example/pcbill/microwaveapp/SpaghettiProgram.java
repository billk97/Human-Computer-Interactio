package com.example.pcbill.microwaveapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SpaghettiProgram extends AppCompatActivity {

    Button BackSpaButton;
    Button FirstChoiceSpaButton;
    Button SecondChoiceSpaButton;
    Button ThirdChoiceSpaButton;
    Button FourthChoiceSpaButton;
    Button StartSpaButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spaghetti_programm);

        initializeVriable();
        BackSpaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), MicroPrograms.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }


    private void initializeVriable()
    {
        BackSpaButton=(Button) findViewById(R.id.SpaBackButton);
        FirstChoiceSpaButton=(Button) findViewById(R.id.buttonFirstChoiceSpa);
        SecondChoiceSpaButton=(Button) findViewById(R.id.buttonSecondChoiceSpa);
        ThirdChoiceSpaButton=(Button) findViewById(R.id.buttonThirdChoiceSpa);
        FourthChoiceSpaButton=(Button) findViewById(R.id.buttonFourthChoiceSpa);
        StartSpaButton=(Button) findViewById(R.id.buttonStartSpa);

    }
}