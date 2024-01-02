package com.example.buttonschool;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.graphics.Color;
import java.util.Random;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button freerobux;
    private Random rnd = new Random();

    private TextView tv;

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        tv = findViewById(R.id.robuxamount);
        freerobux  = findViewById(R.id.FreeRobux);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void go(View view)
    {
        counter++;
        tv.setText(counter);
        freerobux.setBackgroundColor(Color.rgb(0,rnd.nextInt(255),0));

    }
}