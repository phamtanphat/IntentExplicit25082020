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
//        Intent intent = getIntent();
//        if (intent != null){
//            String chuoi = intent.getStringExtra(AppConstant.KEY_STRING);
//            Toast.makeText(this, chuoi, Toast.LENGTH_SHORT).show();
//        }
        // 2 : Get Array drawable
//        Intent intent = getIntent();
//        if (intent != null){
//            int [] arrDrawable = intent.getIntArrayExtra(AppConstant.KEY_ARRAY);
//            Toast.makeText(this, arrDrawable.length + "", Toast.LENGTH_SHORT).show();
//        }
        // 3 : Get Object
        Intent intent = getIntent();
        if (intent != null){
            Person person = (Person) intent.getSerializableExtra(AppConstant.KEY_OBJECT);
            Toast.makeText(this, person.name + "", Toast.LENGTH_SHORT).show();
        }
    }
}