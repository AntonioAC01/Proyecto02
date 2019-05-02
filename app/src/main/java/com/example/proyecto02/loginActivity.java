package com.example.proyecto02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {

    private TextView txtnombre,txtloginsus,txtwelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        txtloginsus=findViewById(R.id.txtloginsus);
        txtwelcome=findViewById(R.id.txtwelcome);
        txtnombre=findViewById(R.id.txtnombre);

        Bundle a=this.getIntent().getExtras();
        String nombre=a.getString("nombre");
        txtnombre.setText("Hi "+nombre);

    }
}
