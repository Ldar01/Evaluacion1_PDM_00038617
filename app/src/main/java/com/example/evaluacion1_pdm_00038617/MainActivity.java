package com.example.evaluacion1_pdm_00038617;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.evaluacion1_pdm_00038617.Utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    private TextView prod_1, prod_2, prod_3,prod_4,prod_5,prod_6,prod_7,prod_8,prod_9;
    private int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0, cont8=0, cont9=0;
    private EditText username, email;
    private Button send;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FindIds();

        send.setOnClickListener(v->{
            Intent intento = new Intent(MainActivity.this, second.class);
            intento.putExtra(AppConstants.TEXT_KEY_PROD_1,prod_1.getText().toString());
            intento.putExtra(AppConstants.TEXT_KEY_PROD_2,prod_2.getText().toString());
            intento.putExtra(AppConstants.TEXT_KEY_PROD_3,prod_3.getText().toString());
            intento.putExtra(AppConstants.TEXT_KEY_PROD_4,prod_4.getText().toString());
            intento.putExtra(AppConstants.TEXT_KEY_PROD_5,prod_5.getText().toString());
            intento.putExtra(AppConstants.TEXT_KEY_PROD_6,prod_6.getText().toString());
            intento.putExtra(AppConstants.TEXT_KEY_PROD_7,prod_7.getText().toString());
            intento.putExtra(AppConstants.TEXT_KEY_PROD_8,prod_8.getText().toString());
            intento.putExtra(AppConstants.TEXT_KEY_PROD_9,prod_9.getText().toString());
            intento.putExtra(AppConstants.TEXT_KEY_USER,username.getText().toString());
            intento.putExtra(AppConstants.TEXT_KEY_EMAIL,email.getText().toString());


            startActivity(intento);
        });

        prod_1.setOnClickListener(v->{
            cont1++;
            prod_1.setText(cont1+"");
        });
        prod_2.setOnClickListener(v->{
            cont2++;
            prod_2.setText(cont2+"");
        });
        prod_3.setOnClickListener(v->{
            cont3++;
            prod_3.setText(cont3+"");
        });
        prod_4.setOnClickListener(v->{
            cont4++;
            prod_4.setText(cont4+"");
        });
        prod_5.setOnClickListener(v->{
            cont5++;
            prod_5.setText(cont5+"");
        });
        prod_6.setOnClickListener(v->{
            cont6++;
            prod_6.setText(cont6+"");
        });
        prod_7.setOnClickListener(v->{
            cont7++;
            prod_7.setText(cont7+"");
        });
        prod_8.setOnClickListener(v->{
            cont8++;
            prod_8.setText(cont8+"");
        });
        prod_9.setOnClickListener(v->{
            cont9++;
            prod_9.setText(cont9+"");
        });


    }

    public void FindIds(){
        prod_1 = findViewById(R.id.prod_1);
        prod_2 = findViewById(R.id.prod_2);
        prod_3 = findViewById(R.id.prod_3);
        prod_4 = findViewById(R.id.prod_4);
        prod_5 = findViewById(R.id.prod_5);
        prod_6 = findViewById(R.id.prod_6);
        prod_7 = findViewById(R.id.prod_7);
        prod_8 = findViewById(R.id.prod_8);
        prod_9 = findViewById(R.id.prod_9);
        send = findViewById(R.id.button_send);
        email = findViewById(R.id.correo_edit);
        username = findViewById(R.id.username_edit);
    }
}
