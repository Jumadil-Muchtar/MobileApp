package com.example.myprofile;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class SkillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);
    }

    public void skillToHome(View view) {
        Intent sth = new Intent(this, MainActivity.class);
        startActivity(sth);
    }

    public void skillToProfil(View view) {
        Intent stp = new Intent(this, ProfilActivity.class);
        startActivity(stp);
    }
}