package com.example.ahmedosman.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int clicks;
    private int aClicks;
    private int bClicks;

    private Button mClickBtn;
    private Button mABtn;
    private Button mBBtn;

    private TextView mClickText;
    private TextView mAText;
    private TextView mBText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mClickBtn = findViewById(R.id.clickbtn);
        mABtn = findViewById(R.id.aBtn);
        mBBtn = findViewById(R.id.bBtn);

        mClickText = findViewById(R.id.clicksText);
        mAText = findViewById(R.id.aText);
        mBText = findViewById(R.id.bText);

        mClickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                mClickText.setText("Clicks: " + clicks);
            }
        });

        mABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aClicks++;
                mAText.setText("A: " + aClicks);
            }
        });

        mBBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bClicks++;
                mBText.setText("B: " + bClicks);
            }
        });

        ;
    }
}
