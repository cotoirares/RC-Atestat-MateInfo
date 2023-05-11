package com.example.mate_info_atestat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;

public class ExamDefault extends AppCompatActivity {

    private TextView nota;
    private ImageView intrebare;
    private AppCompatButton variantaA, variantaB, variantaC, variantaD;
    private int notaDinamic;
    private String raspCorect;
    private StorageReference storageReference;

    private Firebase grilaRef, variantaAref, variantaBref, variantaCref, variantaDref, raspCorectref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_default);
        Firebase.setAndroidContext(this);

        nota = (TextView) findViewById(R.id.score);
        intrebare = (ImageView)  findViewById(R.id.intrebare);

        variantaA = (AppCompatButton) findViewById(R.id.choice1);
        variantaB = (AppCompatButton) findViewById(R.id.choice2);
        variantaC = (AppCompatButton)  findViewById(R.id.choice3);
        variantaD = (AppCompatButton)  findViewById(R.id.choice4);

        updateQ();
    }
    public void updateQ(){
        grilaRef = new Firebase("https://mateinfo-atestat-default-rtdb.europe-west1.firebasedatabase.app/0/enunt");
        grilaRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                /*String intr = dataSnapshot.getValue(String.class);
                intrebare.setText(intr);*/
                String imageurl = dataSnapshot.getValue(String.class);
                Glide.with(getApplicationContext())
                        .load(imageurl)
                        .into(intrebare);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
            }
        });
        variantaAref = new Firebase("https://mateinfo-atestat-default-rtdb.europe-west1.firebasedatabase.app/0/a");
        variantaAref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String var = dataSnapshot.getValue(String.class);
                variantaA.setText(var);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
            }
        });

        variantaBref = new Firebase("https://mateinfo-atestat-default-rtdb.europe-west1.firebasedatabase.app/0/b");
        variantaBref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String var = dataSnapshot.getValue(String.class);
                variantaB.setText(var);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
            }
        });

        variantaCref = new Firebase("https://mateinfo-atestat-default-rtdb.europe-west1.firebasedatabase.app/0/c");
        variantaCref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String var = dataSnapshot.getValue(String.class);
                variantaC.setText(var);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
            }
        });

        variantaDref = new Firebase("https://mateinfo-atestat-default-rtdb.europe-west1.firebasedatabase.app/0/d");
        variantaDref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String var = dataSnapshot.getValue(String.class);
                variantaD.setText(var);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
            }
        });
    }
}