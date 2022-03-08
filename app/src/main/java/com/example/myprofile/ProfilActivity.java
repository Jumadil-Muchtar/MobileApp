package com.example.myprofile;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

    }

    public void profilToHome(View view) {
        Intent pth = new Intent(this, MainActivity.class);
        startActivity(pth);

    }

    public void profilToSkill(View view) {
        Intent pts = new Intent(this, SkillActivity.class);
        startActivity(pts);
    }
}