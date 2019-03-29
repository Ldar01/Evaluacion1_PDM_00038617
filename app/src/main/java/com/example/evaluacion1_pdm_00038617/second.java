package com.example.evaluacion1_pdm_00038617;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.evaluacion1_pdm_00038617.Utils.AppConstants;

public class second extends AppCompatActivity {

    private TextView prod_1_r, prod_2_r, prod_3_r,prod_4_r,prod_5_r,prod_6_r,prod_7_r,prod_8_r,prod_9_r, email, username;
    private Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intento = this.getIntent();

        FindIds();

        if (intento!=null) {
            prod_1_r.setText(intento.getStringExtra(AppConstants.TEXT_KEY_PROD_1));
            prod_2_r.setText(intento.getStringExtra(AppConstants.TEXT_KEY_PROD_2));
            prod_3_r.setText(intento.getStringExtra(AppConstants.TEXT_KEY_PROD_3));
            prod_4_r.setText(intento.getStringExtra(AppConstants.TEXT_KEY_PROD_4));
            prod_5_r.setText(intento.getStringExtra(AppConstants.TEXT_KEY_PROD_5));
            prod_6_r.setText(intento.getStringExtra(AppConstants.TEXT_KEY_PROD_6));
            prod_7_r.setText(intento.getStringExtra(AppConstants.TEXT_KEY_PROD_7));
            prod_8_r.setText(intento.getStringExtra(AppConstants.TEXT_KEY_PROD_8));
            prod_9_r.setText(intento.getStringExtra(AppConstants.TEXT_KEY_PROD_9));
            email.setText(intento.getStringExtra(AppConstants.TEXT_KEY_EMAIL));
            username.setText(intento.getStringExtra(AppConstants.TEXT_KEY_USER));
        }

        share.setOnClickListener(v->{
            Intent intento_compartir = new Intent();
            intento_compartir.setAction(Intent.ACTION_SEND);
            intento_compartir.setType("text/plain");
            intento_compartir.putExtra(Intent.EXTRA_TEXT,prod_1_r.getText().toString()+"\n"+
                    prod_2_r.getText().toString()+"\n"+prod_3_r.getText().toString()+"\n"+prod_4_r.getText().toString()
                    +"\n"+prod_5_r.getText().toString()+"\n"+prod_6_r.getText().toString()+"\n"+prod_7_r.getText().toString()
                    +"\n"+prod_8_r.getText().toString()
                    +"\n"+prod_9_r.getText().toString());
            startActivity(intento_compartir);
        });
    }

    public void FindIds(){
        prod_1_r = findViewById(R.id.prod_1_results);
        prod_2_r = findViewById(R.id.prod_2_results);
        prod_3_r = findViewById(R.id.prod_3_results);
        prod_4_r = findViewById(R.id.prod_4_results);
        prod_5_r = findViewById(R.id.prod_5_results);
        prod_6_r = findViewById(R.id.prod_6_results);
        prod_7_r = findViewById(R.id.prod_7_results);
        prod_8_r = findViewById(R.id.prod_8_results);
        prod_9_r = findViewById(R.id.prod_9_results);
        share = findViewById(R.id.button_share);
        email = findViewById(R.id.correo_second);
        username = findViewById(R.id.username_second);
    }

}
