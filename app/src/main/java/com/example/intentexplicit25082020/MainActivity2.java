package com.example.intentexplicit25082020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //1 : Get String
        Intent intent = getIntent();
        if (intent != null){
            String chuoi = intent.getStringExtra(AppConstant.KEY_STRING);
            Toast.makeText(this, chuoi, Toast.LENGTH_SHORT).show();
        }
    }
}