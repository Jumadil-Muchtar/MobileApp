package com.example.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void homeToProfil(View view) {
        Intent htp = new Intent(this, ProfilActivity.class);
        startActivity(htp);
    }

    public void homeToSkill(View view) {
        Intent hts = new Intent(this, SkillActivity.class);
        startActivity(hts);
    }
}