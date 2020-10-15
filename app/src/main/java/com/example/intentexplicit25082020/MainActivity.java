package com.example.intentexplicit25082020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.intentexplicit25082020.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.buttonString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
//                intent.putExtra(AppConstant.KEY_STRING,"hello");
//                startActivity(intent);
                sendDataIntent(AppConstant.KEY_STRING,"hello");
            }
        });

        mBinding.buttonArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int [] arrDrawable = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground};
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra(AppConstant.KEY_ARRAY,arrDrawable);
                startActivity(intent);
            }
        });
        mBinding.buttonObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Person> people = new ArrayList<>();
                Person person = new Person("Nguyen Van A",20);
                people.add(person);
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra(AppConstant.KEY_OBJECT,people);
                startActivity(intent);
            }
        });


    }
    public <T> void sendDataIntent(String key , T value){
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        if (value instanceof String){
            intent.putExtra(key,(String) value);
        }
        startActivity(intent);
    }
}