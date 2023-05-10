package com.example.mate_info_atestat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Dashboard extends AppCompatActivity {

    ImageView logofaq, logocontact, logodoc;
    TextView textfaq, textcontact, textdoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);

        logofaq = (ImageView) findViewById(R.id.logosetari);
        textfaq = (TextView) findViewById(R.id.textView6);
        logocontact = (ImageView) findViewById(R.id.ic_support);
        textcontact = (TextView) findViewById(R.id.textView8);
        logodoc = (ImageView) findViewById(R.id.ic_documentatie);
        textdoc = (TextView) findViewById(R.id.textView7);

        logofaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Faq.class);
                startActivity(intent);
            }
        });

        textfaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Faq.class);
                startActivity(intent);
            }
        });

        logocontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, ContactAdmin.class);
                startActivity(intent);
            }
        });

        textcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, ContactAdmin.class);
                startActivity(intent);
            }
        });

        logodoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com")));
            }
        });

        textdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com")));
            }
        });
    }
}