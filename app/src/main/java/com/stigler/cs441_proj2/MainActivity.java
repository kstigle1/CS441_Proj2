package com.stigler.cs441_proj2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView welcomeText;
    Button screenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screenButton = (Button) findViewById(R.id.screenButton);
    }

    public void switchScreens (View view)
    {
        Intent actAction = new Intent(this, SecondActivity.class);
        startActivity(actAction);
    }
}