package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.txtEmail);
        et2=(EditText)findViewById(R.id.txtPasword);
    }

    public void ingresar  (View view){
        Intent i = new Intent(this,Exito.class);
        Intent e = new Intent(this,Fallido.class);
        String u = "Admin";
        String ps = "Admin";
        String uObtenido;
        String psObtenida;
        System.out.println("Ususario "+et1.toString());
        System.out.println("Ususario "+et2.toString());
        if(et1.equals(u) && et2.equals(ps)) {
            i.putExtra("Nombre", et1.getText().toString());
            startActivity(i);
        }else{
            startActivity(e);
        }

    }
}
