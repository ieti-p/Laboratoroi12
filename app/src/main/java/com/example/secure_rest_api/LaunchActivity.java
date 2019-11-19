package com.example.secure_rest_api;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LaunchActivity extends AppCompatActivity {


    public static final String TOKEN_KEY = "TOKEN_KEY";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPref=
                //preference_file_key
                getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);

        if(sharedPref.contains(TOKEN_KEY)){
            //todo G TO MAINACTIVITI


        }   else{
            //todo G TO MAINACTIVITI

        }
        //setContentView(R.layout.activity_launch);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
