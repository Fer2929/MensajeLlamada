package com.example.mensajellamada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtTelefono;
    EditText txtMensaje;
    Button btn;

    public static Intent intent = new Intent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTelefono = findViewById(R.id.idNumero);
        txtMensaje = findViewById(R.id.idMensaje);
        btn = (Button) findViewById(R.id.idBtn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("tel",txtTelefono.getText().toString());
                intent.putExtra("texto",txtMensaje.getText().toString());
            }
        });





    }


}
