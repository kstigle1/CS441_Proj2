package com.stigler.cs441_proj2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{

    Button backButton;
    TextView typedText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        backButton = (Button) findViewById(R.id.backButton);
        typedText = (TextView) findViewById(R.id.typedText);

        Intent actActionMain = getIntent();
        String movedText = actActionMain.getStringExtra("theText");

        typedText.setText("Hello " + movedText + "!");
    }

    public void goBack(View view)
    {
        Intent actAction = new Intent(this, MainActivity.class);
        startActivity(actAction);
    }
}