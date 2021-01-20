package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editName, editDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asignarReferencias();
    }

    private void asignarReferencias(){
        editName=findViewById(R.id.editName);
        editDatos=findViewById(R.id.editDatos);
    }
    public void MostrarNombre(View View){
        String nom;
        nom=editName.getText().toString();
        editDatos.setText("Nombres: "+nom);
    }
}