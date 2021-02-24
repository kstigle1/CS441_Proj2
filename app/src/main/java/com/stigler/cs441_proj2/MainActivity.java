package com.stigler.cs441_proj2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView welcomeText;
    Button screenButton;
    EditText inputText;
    RadioGroup radios;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screenButton = (Button) findViewById(R.id.screenButton);
        inputText = (EditText) findViewById(R.id.inputText);
        radios = (RadioGroup) findViewById(R.id.leaugeButtons);
        radios.clearCheck();

        radios.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                RadioButton pickedRadio = (RadioButton) group.findViewById(checkedId);
            }
        });
    }

    public void switchScreens (View view)
    {
        String movingText = inputText.getText().toString();
        Intent actAction = new Intent(this, SecondActivity.class);
        Singleton singleton = Singleton.getInstance();
        singleton.name = movingText;

        int selectedRadio = radios.getCheckedRadioButtonId();
        if (selectedRadio != -1)
        {
            RadioButton radioLeague = (RadioButton) radios.findViewById(selectedRadio);
            singleton.league = (String) radioLeague.getText();
        }
        else
        {
            singleton.league = "";
        }

        startActivity(actAction);
    }

    public void clearRadios (View view)
    {
        radios.clearCheck();
    }
}