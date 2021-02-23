package com.stigler.cs441_proj2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{

    Button backButton;
    TextView typedText;
    ImageView logoNHL, logoNFL, logoMLB, logoNBA;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        backButton = (Button) findViewById(R.id.backButton);
        typedText = (TextView) findViewById(R.id.typedText);
        logoNHL = (ImageView) findViewById(R.id.NHL);
        logoNFL = (ImageView) findViewById(R.id.NFL);
        logoMLB = (ImageView) findViewById(R.id.MLB);
        logoNBA = (ImageView) findViewById(R.id.NBA);

        Intent actActionMain = getIntent();
        String movedText = actActionMain.getStringExtra("theText");
        String pickedLeague = actActionMain.getStringExtra("league");

        typedText.setText("Hello " + movedText + "!");

        switch (pickedLeague)
        {
            case "NHL": logoNHL.setAlpha((float) 1.0);
            break;
            case "NFL": logoNFL.setAlpha((float) 1.0);
            break;
            case "MLB": logoMLB.setAlpha((float) 1.0);
            break;
            case "NBA": logoNBA.setAlpha((float) 1.0);
            break;
            case "": ;
            break;
        }
    }

    public void goBack(View view)
    {
        Intent actAction = new Intent(this, MainActivity.class);
        startActivity(actAction);
    }
}