package com.example.sqdan.saludo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class act_Principal extends AppCompatActivity {

    EditText txtNombre;
    Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_principal);
        txtNombre = (EditText)findViewById(R.id.txtNombre);
        btnAceptar = (Button)findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtNombre.getText().toString();
                Toast.makeText(getApplicationContext(),"Hola, "+nombre,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
