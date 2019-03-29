package com.example.evaluacion1_pdm_00038617;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {

    private TextView prod_1, prod_2, prod_3,prod_4,prod_5,prod_6,prod_7,prod_8,prod_9, email, username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intento = this.getIntent();

        if (intento!=null) {

        }
    }

}
