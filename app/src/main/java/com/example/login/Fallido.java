package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Fallido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fallido);
    }

    public void volver (View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        //Intent c = new Intent(this,Fallido.class);
        finish();
    }
}
