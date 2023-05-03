package com.example.mate_info_atestat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Inregistrare extends AppCompatActivity {
    EditText emailInput, parolaInput, telInput, numeInput;
    Button haveAcc, inreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inregistrare);
        haveAcc = findViewById(R.id.haveacc);
        inreg = findViewById(R.id.inreg);
        numeInput = findViewById(R.id.numeFull);
        parolaInput = findViewById(R.id.parola);
        emailInput = findViewById(R.id.mail);
        telInput = findViewById(R.id.telefon);
        haveAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Inregistrare.this, Login.class);
                startActivity(intent);
            }
        });

        inreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PerformAuth();
            }
        });
    }

    private void PerformAuth() {
        String email = emailInput.getText().toString();
        String parola = parolaInput.getText().toString();

    }
}