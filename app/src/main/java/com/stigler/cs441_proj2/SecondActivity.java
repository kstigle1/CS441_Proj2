package com.stigler.cs441_proj2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity
{

    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        backButton = (Button) findViewById(R.id.backButton);
    }

    public void goBack(View view)
    {
        Intent actAction = new Intent(this, MainActivity.class);
        startActivity(actAction);
    }
}