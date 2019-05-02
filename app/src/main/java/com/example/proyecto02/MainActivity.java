package com.example.proyecto02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText txtpass,txtuser;
    private Button btnlogin;
    private TextView txtnombre,txtloginsus,txtwelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        txtuser=findViewById(R.id.txtuser);
        txtpass=findViewById(R.id.txtpass);
        btnlogin=findViewById(R.id.btnlogin);
        txtnombre=findViewById(R.id.txtnombre);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user="antonio";
                String pass="pass";
              if  (txtuser.getText().toString().equals(user) && txtpass.getText().toString().equals(pass)){
                  Intent intent = new Intent(MainActivity.this, loginActivity.class);
                  intent.putExtra("nombre",txtuser.getText().toString());
                  startActivity(intent);

                }else{

                  Toast.makeText(MainActivity.this, "Los Datos son incorrectos", Toast.LENGTH_SHORT).show();
              }

            }
        });
    }
}
